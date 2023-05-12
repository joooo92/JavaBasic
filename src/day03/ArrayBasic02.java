package day03;

public class ArrayBasic02 {
	public static void main(String[] args) {
		// 배열의 순회
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; //길이가 10
		
		// 배열의 길이가 짧으면 가능하나, 100 1000 등 너무 길어지면 불가능해서 놉
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
		
		// 반복문을 사용하여 배열을 나열하면 길어지더라도 가능!!! ★★★★★★★★★★★
//		int a = 0;
//		while(a < arr.length) {
//			
//			System.out.println("배열의" + a + "인덱스: " + arr[a]);
//			
//			a++;
//		}
		
		
		
		// 배열값들의 합
		
		int sum = 0;
		int i = 0;
		while(i < arr.length) {
			
			sum = sum + arr[i]; // sum += arr[i]
			i++;
		} 
		System.out.println("배열요소의 합" + sum);
				
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
