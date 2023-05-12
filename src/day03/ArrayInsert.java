package day03;

import java.util.Arrays;

/**
 * 23.04.17
 */
public class ArrayInsert {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int[] newArr = new int[arr.length + 1];
		
		
		int data = 100; // 중간에 추가할 값
		int targetIndex = 2; // 중간에 추가될 위치 >> 10,20,100,30,40,50
		
		//newArr의 기존배열의 값을 옮김
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(newArr));
		
		// 배열의 추가할 인덱스 부터 마지막-1 까지 옮겨담는 작업 (추가할 인덱스부터 바꾸면 같은값이 계속 옮겨져서 오류!!!)
//		for(int i = targetIndex; i < newArr.length-1; i++) {
//			newArr[i+1] = newArr[i];
//		
//		} >> 요렇게 하면 오류가 남. 이건 오답!!! 아랫쪽이 답변임
		
		// 배열의 마지막부터 타겟인덱스 까지 옮겨담는 작업 (뒤에서부터 차근히 바꿔야됨)
		for(int i = newArr.length-1; i > targetIndex; i--) {
			newArr[i] = newArr[i-1];
		}
			
			// 인덱스번째에 데이터 추가
			newArr[targetIndex] = data;
		
			// arr를 newArr로 변경
			arr = newArr;
			newArr = null; // 완전삭제
			
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
	}

}
