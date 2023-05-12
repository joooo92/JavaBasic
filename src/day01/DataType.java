package day01;

public class DataType {
	public static void main(String[] args) {
		
		// 정수형 타입
		byte a = 127;
		byte a1 = -128;
		
		short b = 32767;
		short b1 = -32767;
		
		int c = 2147483647;
		int c1 = -2147483647;
		
		long d = 123123123123123L; // L -> 롱타입이야~
		
		// 2진수, 8진수, 16진수
		int bin = 010; // 8진수 앞에 0을 붙임
		System.out.println("8진수 010은:" + bin + "입니다");
		
		int bin2 = 0b111; // 2진수는 앞에 0b를 붙임
		System.out.println("2진수 111은:" + bin2);
		
		int hexa = 0xa9;
		System.out.println("16진수 A9는:" + hexa);
		
		System.out.println("-------------------------");
		
		// 실수형타입
		float f1 = 3.14F; // F 이거 플롯이야~
		double d1 = 3.14; //기본형
		
		System.out.println(f1);
		System.out.println(d1);
		
 		float f2 = 3.141592653589793238F;
 		double d2 = 3.141592653589793238;
		
 		System.out.println(f2); // 소수점 7자리까지 
		System.out.println(d2); // 소수점 15자리까지
		
		
		System.out.println("----------------------------");

		// true, false 저장가능
		boolean bool1 = true;
		boolean bool2 = false;
		
		
		
	}

}
