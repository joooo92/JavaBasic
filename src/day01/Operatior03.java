package day01;

public class Operatior03 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		
		// if뒤에 소괄호가 true면 if 중괄호 실행, false 라면 else 문 실행
		if( x != 10 & ++ y == 21) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값: "+ y);
		
		
		if(x == 10 | ++ y == 21) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값: "+ y);		
		
		System.out.println("------------------------------------");
		
		x = 10;
		y = 20;
		
		if( x != 10 && ++ y == 21) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값: "+ y);
		
		
		if(x == 10 || ++ y == 21) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값: "+ y);		
		
		
		
	}
}
