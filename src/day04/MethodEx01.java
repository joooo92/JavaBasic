package day04;
/**
 * 23.04.18
 */

public class MethodEx01 {
	public static void main(String[] args) {
		/*
		 * 메서드는 생성과 호출이 있습니다.
		 * 메서드는 메서드 안에서 생성할 수 없습니다. 
		 */
		
		//1~10까지 합
		System.out.println("1부터 10까지의 합: " + calSum());
		int result = calSum();
		System.out.println("1부터 10까지의 합: " + result);
		
		String result2 = calSum2();
		System.out.println(result2);
		
		
	} // main이 끝나는 지점

	// 반환유형 이름 () { 쓸 함수 }
	static int calSum() {
		
		// 여기에서는 지금까지 공부한 모든 문법들 다 사용 가능! 배열 스캐너 등등 다 가능쓰
		
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum += i; 
		}
		
		return sum; //합계를 반환
	}
	
	// 문자열 반환
	static String calSum2() {
		// A~Z문자열 합
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		//return null; // 뭘 넣을 지 모르겠으면 String는 일단 null 넣자
		return str; // 문자열 반환
	}
	
	
}
