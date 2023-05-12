package day04;

import java.util.Arrays;

/**
 * 23.04.19
 */
public class StringManipulation {
	public static void main(String[] args) {
		
		// 문자열다루기
		// 문자열은 사실 배열입니다. 문자열은 인덱스가 있습니다. 
		
		String str = "안녕하세요~영어로 하면 하이!";
		//System.out.println(str[0]); >> 안되는 문법
		
		//문자열을 다루는 다양한 메서드를 제공
		
		
		//문자열 한글자 자르기 charAt
		char c = str.charAt(4);
		System.out.println(c);
		
		//문자열의 위치 확인 indexOf
		int idx = str.indexOf("안"); 
		System.out.println("'안' 의 위치: " + idx);
		int idx2 = str.indexOf("홍"); // 찾는 문자가 없다면 -1 반환
		System.out.println("'홍' 의 위치: " + idx2);
	
		
		//문자열의 위치 확인(뒤에서부터 찾음) lastIndexOf 
		int idx3 = str.lastIndexOf("하");
		System.out.println("뒤에서부터 찾은 '하'의 위치: " + idx3);
		
		// 문자열 변환 toUpperCase, toLowerCase
		String s = "abcDEF";
		
		String result = s.toLowerCase(); //모든 문자를 소문자로 변환
		System.out.println(result);
		System.out.println(s); //원본문자열은 변경되지않고 그대로 유지된다. 
		
		String result2 = s.toUpperCase();
		System.out.println(result2); // 모든문자를 대문자로 변환
		
		System.out.println("====================================");

		//문자열 변경 replace
		s = "abcdefaaa";
		
		String result3 = s.replace("a", "x"); // a-> x로 변경(전부다!)
		System.out.println(result3); 
		System.out.println(s);// 원본문자열은 변경되지않고 그대로 유지된다. 
		
		String result4 = s.replaceFirst("a", "x");
		System.out.println(result4); //a -> x로 변경 (첫번째로 나온 a만!)
		
		System.out.println("====================================");
		//공백제거 trim - 중간중간 끼어있는 공백은 삭제할 수 없음
		str = "    010-1111-2222  ";
		
		String result5 = str.trim(); //앞뒤 공백을 제거해서 반환
		System.out.println(str); // 원본문자열은 변경되지않고 그대로 유지된다. 
		System.out.println(result5);
		
		str = " 안녕 하세요? 오늘은 4월 19일 입니다  ";
		System.out.println(str.trim());
		// 뒤의 공백들도 다 삭제하고 싶을경우엔 replace를 사용하자
		str = str.replace(" ",""); // 원본문장까지 바꾸고싶을경우 좌측처럼 원본 변수에 변화같을 넣자.
		System.out.println(str);
		
		System.out.println("====================================");
		// 문자열 자르기
		
		// substring - 인덱스 기준으로 자름 (특정 위치에서 자르기)
		str = "010-1111-2222";
		String result6 = str.substring(9); // 인덱스번째 미만값을 절삭
		System.out.println(result6);
		
		String result7 = str.substring(4, 8); // 4<= x < 8 인덱스 추출
		System.out.println(result7);
		
		System.out.println(str); // 원본문자열은 변경되지않고 그대로 유지된다.
		
		//★★★ split - 특정 문자를 기준으로 자름 (제대로 사용하려면 정규 표현식 이라는 것을 알아야됨;)
		String[] arr = str.split("-");
		System.out.println(Arrays.toString(arr));
		
		
		//split를 사용하여 한글자로 자르기
		String[] arr2 = str.split("");
		System.out.println(Arrays.toString(arr2));
		
		//toCharArray - 한글자씩 char형으로 자름
		char[] arr3 = str.toCharArray();
		System.out.println(Arrays.toString(arr3));
		
		
		System.out.println("====================================");
		//문자열의 길이 length()
		str = "안녕하세요";
		int len = str.length();
		System.out.println("문자열길이: " + len);
		
		// ★★★★★문자열의 비교 equals()
		if(str.equals("안녕하세요") ) {
			System.out.println("두 문자가 같음");
		}
		
		// 문자열의 포함여부 contains()
		if(str.contains("녕") ) {
			System.out.println("녕이 포함되어있음");
		}
		
		
		
		
	}
}
	
	
	
