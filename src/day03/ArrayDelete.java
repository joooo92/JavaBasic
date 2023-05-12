package day03;

import java.util.Arrays;

/**
 * 23.04.17
 */
public class ArrayDelete {
	
	public static void main(String[] args) {
		
		// 삭제의 개념 - 배열은 삭제가 없습니다. 
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int[] newArr = new int[arr.length - 1];  // 삭제한 후 복사할 새로운 배열 
		
		
		//삭제하는 코드
		int index = 5; // 삭제할 위치
		for(int i = index; i < arr.length - 1; i++) { // i < arr.length로 할경우 범위 밖에서 끌어오는거라 에러뜸 
			arr[i] = arr[i + 1]; 
		}
		
		//새로운 배열에 기존배열을 옮겨담는 작업
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];	
		}
		
		
		//기존 arr는 지움
		arr = null;
		
		System.out.println(Arrays.toString(newArr));
		
		
		
		
		
		
	}
	
}
