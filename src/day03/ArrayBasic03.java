package day03;

import java.util.Arrays;

/**
 * 23.04.14
 */

public class ArrayBasic03 {
	
	public static void main(String[] args) {
		// 배열은 크기가 고정
		//  크기가 100인 배열에 1~ 100까지 수를 저장.
		
		int [] arr = new int[100];
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		
		///////////////////////////////
		// 배열요소의 문자열 합
//		for(int i =0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		String str = " ";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i] + " ";
		}
		System.out.println(str);
	
		
		
		
		
		
		
		
		
		
		
	}
}
