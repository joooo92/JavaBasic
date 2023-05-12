package day02;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		
		System.out.println( ); // 줄바꿈
		
		// 1. 7에서 100 까지 정수중에서 7의 배수만 가로로 출력.
		
		for(int a = 7; a <= 100; a++) {
			if(a % 7 == 0) {
				System.out.print(a + " ");
			}
		}
		
		System.out.println( );
		System.out.println("=======================");
		
		//2. 1~200까지의 정수 중애 9의 배수의 갯수를 출력
		
		int count = 0;
		for(int a = 1; a <= 200; a++) {
			if(a % 9 == 0) {
				count++;
			}
		} System.out.println("9의 배수의 갯수: " + count);                                                                                             
		
		
		System.out.println("=======================");
		
		//3. 100~50 사이 수들의 합
		int sum = 0;
		for(int a = 50; a <= 100; a++) {
			sum = sum + a;
		} System.out.println(sum);
			
		
		System.out.println("=======================");
		
		//4. A~Z까지 가로로 붙여서 출력, A=65, Z=90
		
		//4-1 		
		
		for(char a = 65; a <=90; a++) {
			System.out.print(a + " ");
		}
		// 4-2
		String str = "";
		for(char a = 'A'; a <='Z'; a++) {
			str += a;
		}
		System.out.print(str);
				
		
		
		
		System.out.println( );
		System.out.println("=======================");
		
		//5. 입력받은 정수까지 팩포리얼 5팩토리얼 = 5 * 4 * 3 * 2 * 1
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요> ");
		int num = scan.nextInt();
		
		int sum2 = 1;
		for(int a = 1; a <= num; a++) {
			sum2 *= a;
		}
		
		System.out.print(num + "!은" + sum2);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
