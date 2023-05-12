package day03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 23.04.17
 */
public class ArraySearch02 {
		public static void main(String[] args) {
			
			// 이진탐색 = 반을 분할해서 찾아가는 방법 
			// 조건 : 순서대로 정렬
			/*
			 * 1. 포인터를 처음과 끝에 2개 배치(start, end)
			 * 2. 중간값을 구함
			 * 3. 중간값이 찾는값인지 확인
			 * 4. 중간값이 찾는값보다 크다면, end를 중간값 -1로 내림
			 * 5. 중간값이 찾는값보다 작다면, start를 중간값 +1 로 올림
			 */
			
			int[] arr = {1, 3, 5, 10, 20, 30, 50, 80, 100};
			
			Scanner scan = new Scanner(System.in);
			System.out.print("찾을값> ");
			int find = scan.nextInt();
			
			int start = 0;
			int end = arr.length-1; // 8
			//int count = 0; // 회전수 확인 >> 필수는 아니나 회전수 보고싶을 경우 만들면 됨.
			
			while(start <= end) {
				
				//count++; // 회전수 확인
				
				//중간값 구하기
				int mid = (start + end) / 2;
				
				if(arr[mid]== find) {
					//System.out.println("회전수: " + count);
					System.out.println("찾을 값은 : " + mid + "번째 존재합니다");
					break;
				} // 여기에 값을 못찾앗을 경우에 대해서 else로 넣을 경우 찾기전까지 계속 못찾을떄마다 튀어나옴. 아예 반복 끝나고 나와야됨!
				
				// 찾을값이 중간값보다 큰경우
				if(arr[mid] < find) {
					start = mid + 1;
				}else {
					end = mid - 1;
				}
				
			}
			
			// 값을 못찾았을때(없을때)
			if(start > end) {
				System.out.println("찾는값은 없습니다.");
			}
			
			
			// 이진 탐색 - 찾는 위치를 알려줌. (배열에서 50은 어디있니? 랑 같은 말) 찾은값이 없다면 음수를 알려줌
			System.out.println( Arrays.binarySearch(arr, 50) ); // (배열 , 찾을 값) 
			 
			
			
			
			
		
			
			
			
			
		}
}
