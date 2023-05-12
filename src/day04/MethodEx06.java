package day04;

import java.util.Arrays;

/**
 * 23.04.19
 */
public class MethodEx06 {
	public static void main(String[] args) {
		
		// Queue = 먼저 들어간게 먼저 빠진다! (first in, first out)
		
		push(4);
		push(5);
		
		pop();
		System.out.println(Arrays.toString(arr));
		
	}// main
	
	static int[] arr = {1,2,3};
	
	//push -> 특정요소를 마지막에 추가
	static void push(int data) {
		//1. 배열의 크기를 +1 한 새로운 배열 만듦
		int[] temp = new int[arr.length +1]; 
		
		//2. arr배열의 요소를 복사
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		
		//3. 마지막에 추가
		temp[temp.length - 1] =data;
		
		//4. 원본배열을 temp로 변경
		arr = temp;
		temp = null; // arr에 temp 내용 넣어주고, temp는 지움
		
	}
	
	//배열의 맨 앞요소부터 삭제되도록 처리
	static int pop( ) {
		if(arr.length > 0) {
			int del = arr[arr.length -1];
		
			int [] temp = new int[arr.length-1];
		
			for(int a = 0; a < temp.length; a++) {
			temp[a] = arr[a+1];
			}
			arr = temp;
			temp = null;
			
			return del;
		}
		return 0;
	}
	/*  쌤 답변
	 
	static int pop( ) {
		
		if(arr.length > 0) {
			//1. 삭제할 데이터 백업
			int del = arr[0];
			//2. arr - 1인 사본배열 생성
			int[] temp = new int[arr.length -1];
			//3. 배열의 1번째 요소~마지막까지 옮겨담는다.
			for(int i= 0; i < temp.length; i++) {
				temp[i] = arr[i+1];
			}
			//4. 원본배열을
			arr = temp;
			temp = null;
			
			return del;
			
		}	
		return 0;
	}
	*/
	

}
