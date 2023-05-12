package day01;

public class DataType2 {
	public static void main(String[] args) {
		// 단일문자를 저장하는 char = 2byte
		
		char c1 = 'A';
		char c2 = 65;
		
		// 아스키코드 - 미국에서 문자들에 숫자값을. 붙임 단점;영어만 가능. 다른언어 불가능 (1byte)
		// 유니코드 - 표준문자체제-전세계 언어 가능 (2byte - 부호없는 비트체계)
		System.out.println(c1);
		System.out.println(c2);
		
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00';
		
		System.out.println(c3);
		System.out.println(c4); //유니코드 10진수
		System.out.println(c5); //유니코드

		System.out.println(c3 + "-" + c4 +"-" + c5); //유니코드
		
		// 문자열을 저장할 수 있는 String
		String s1 = "가가가가가 ";
		String s2 = "나나나나나";
		
		// 문자를 붙일때 + 를 사용하면 됩니다. 
		System.out.println(s1 + s2);
		
		// 문자와 다른값에 + 연산
		System.out.println(100 + 100); // 숫자 + 숫자
		System.out.println("100" + 100); // 문자 + 숫자 -> 문자가 젤 강함. 문자랑 붙으면 다른것도 문자가 됨
		System.out.println(100 + 100 + "100"); // ^ 숫자끼리 먼저 계산하고, 뒤의 문자랑 붙은부분만 문자화
		
		System.out.println("A" + 10);
		System.out.println('A' + 10);
		
		
		
		
		
	}

}
