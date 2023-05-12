package day03;

import java.util.Arrays;

/*
 * 23.04.14
 */

public class ArraySort02 {
	public static void main(String[] args) {
		
		
		// 버블정렬 - 가장 느림 (큰값을 뒤로 보낸다.)
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		// 5, 1, 23, 43, 100, 40, 200 // 1회전 후
		// 1, 5, 23, 43, 40, 100, 200 // 2회전 후
		// 1, 5, 23, 40, 43, 100, 200 // 3회전 후 => 정렬 완성
		
		//바깥 반복문 : 회전 수
		//안쪽 반복문 :                                                    
		
		
		
		
		for(int i = 0; i < arr.length-1; i++) {
			
			for(int j = 0; j < arr.length-i-1; j++) {
				System.out.println(j + "+" + (j+1));
			}
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					
//				}
//			}
//			
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		// 아주 유용한 기능
		Arrays.sort(arr); // 가장 빠른 퀵정렬
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		}	
	}

}
