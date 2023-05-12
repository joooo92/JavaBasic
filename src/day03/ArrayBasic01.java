package day03;

import java.util.Arrays;

/**
 * 23-04-14
 */
public class ArrayBasic01 {
	
	public static void main(String[] args) {
		
		// 배열
		int [] arr;
		
		// 배열의 생성
		arr = new int[5];
		
		// 배열의 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// 배열의 주소값(배열이 생성된 위치)
		System.out.println(arr); 
		
		// 배열의 모형을 문자열로 출력 (★★★많이 사용됨★★★)
		System.out.println(Arrays.toString(arr));
		
		// 배열의 값을 변경
		arr[2] = 100; // (30을 100으로 변경됨)
		System.out.println(Arrays.toString(arr));
		
		// 배열의 길이
		System.out.println("배열의 길이: " + arr.length);
		
		// 배열을 선언하는 다양한 방법들(★★★중요★★★) >>1,3번 자주 사용
		//1st
		int[] arr2 = new int[3]; // 값이 안들어있음
		
		//2nd
		int[] arr3 = new int[] {1, 2, 3}; // 값이 각각 1, 2, 3 이 들어있음
		
		//3nd
		int[] arr4 = {1, 2, 3}; // 2번이랑 같은 형태가 나옴
		
		// 배열은 초기값을 저장하지 않으면 기본값으로 자동 초기화
		// int는 0, double = 0.0 String = null
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
