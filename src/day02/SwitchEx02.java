package day02;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		//switch 문장이 else if 문과 상당히 유사함
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수입력>");
		int point = scan.nextInt();
		
		// 변수에 연산식이 들어갈 수 있습니다. 
		switch ( point / 10 ) {
		case 9:
			
			if(point >= 95) {
				System.out.println("A+학점");
			}else {
				System.out.println("A학점");
			}
			System.out.println("상위 10프로네요!");
			break;
		case 8:
			System.out.println("B학점");	
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");			
			break;
		default:
			System.out.println("재수강 입니당!");
			break;
		}
		
		
		
		
	}
}
