package day02;

public class SwitchEx01 {
	public static void main(String[] args) {
		
		int a = 3;
		
		// switch문장의 소괄호에는 변수나, 변수의 연산식 등이 들어갑니다. 
		// 타입은 : 정수, 문자, 문자열 이어야 합니다. (실수는 안됨)
		
		switch(a) {
		
		case 1 :
			System.out.println("1 입니다.");
			break; // switch 문을 곧바로 탈출
		case 2 :
			System.out.println("2 입니다.");
			break;
		case 3 :
			System.out.println("3 입니다.");
			break;
		case 4 :
			System.out.println("4 입니다.");
			break;
		default:
			System.out.println("1~4가 아닙니다.");
			break;
		}
		
		
		
		
		
		
		
	}

}
