package day10.static_basic;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
//		String result = Arrays.toString(new int[3]);
//		
//		System.out.println(result);
		
		System.out.println(MyArrays.printArray(new String[3]));
		
		
		// 클래스가 여러번 로드되더라도 static은 단 1번만 실행됨.
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		
		
		
	}

}
