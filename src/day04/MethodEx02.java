package day04;
/**
 *23.04.18
 */
public class MethodEx02 {
	public static void main(String[] args) {
		/*
		 * 매개변수(parameter)
		 * 메서드가 전달받는 매개값
		 * 여러개 받을 수 도 있고, 받지않을 수도 있습니다.
		 */
	
		//calSum(int a 를 쓰는게 아니라 거기에 들어갈 값을 줘야됨);
		int result = calSum(10);
		System.out.println("결과: " + result);
		
		int result2 = calSum(100);
		System.out.println("결과: " + result2);
		
		int result3 = calSum2(1, 2);
		System.out.println("결과: " + result3);
		
		String result4 = calSum3(5, "가");
		System.out.println("결과: " + result4);
		
		
	}// main
	
	//1~매개변수까지의 합계를 구하는 메서드 >> calSum뒤의 ( ) 안에 들어온게 매개변수!
	static int calSum(int a) {
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}
	
	// 매개변수를 2개 받음
	static int calSum2(int a, int b) {
		//int result = a + b;
		//return result;
		return a + b;
	}
	
	// 간단한 실습 - 정수, 문자열을 전달받는 calSum3() 생성
	static String calSum3(int a, String b) {
		
		String str = "";
		for(int i = 1; i <= a; i++) {
			str += b;
		}
		return str;
	}
	
	
	
	
	
	
	
	
	
	
	
}
