package day03;
/**
 * 23.04.14
 */
public class ArraySearch01 {
	public static void main(String[] args) {
		// 큰 값 찾기
		int [] arr = {54, 23, 12, 76, 99, 1, 2, 3};
		
		int max = 0; // 큰값을 저장할 변수
		int i = 0;
		while(i < arr.length) {
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
			i++;
		}
		
		System.out.println("가장 큰 값 : " + max);
			
		
		
		
		
		
		
		
	}

}