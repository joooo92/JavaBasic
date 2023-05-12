package day03;

import java.util.Arrays;

/**
 * 23.04.14
 */
public class ArraySort01 {
	public static void main(String[] args) {
		
		// 배열 정렬 - 정렬은 특정한 기준에 따라 데이터를 늘어놓는 알고리즘 이다.
		// 종류 : 버블정렬, 선택정렬, 삽입정렬, 퀵정렬,병합 정렬, 힙정렬
		
		
		// 선택정렬
		// 작은수 앞으로 빼기
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		// [1], 23, 5, 43, 200, 100, 40 = 1회전 후
		// 1, [5], 23, 43, 200, 100, 40 = 2회전 후
		// 1, 5, [23], 43, 200, 100, 40 = 3회전 후
		// 1, 5, 23, [40], 200, 100, 43 = 4회전 후
		// 1, 5, 23, 40, [43], 200, 100 = 5회전 후
		// 1, 5, 23, 40, 43, [100], 200 = 6회전 후
		// [] 표시 되어있는게 처음 회전 시작되는 위치
		
		// 바깥 반복문은 회전수
		// 안쪽 반복문은 비교할 값
		
		for(int i = 0; i < arr.length -1; i++) { // 0 ~ 5 까지
			
			for(int j = i+1 ; j < arr.length; j++) {
				
				System.out.println(i + "-" + j);
				
				if(arr[i] > arr[j]) { // 비교대상이 작다면 자리 바꿔야됨 . 꺽쇠를 바꾸면 큰수가 앞으로 옴
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
