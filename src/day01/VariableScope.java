package day01;

public class VariableScope {
	public static void main(String[] args) {
		
		// 변수는 중괄호 안에서 선언되고, 중괄호 안에서만 유효합니다. 
		
		
		int num1 = 10;
		int num2 = 20;
		//int num1 =10, num2 = 20; << 위의 두줄과 같은 내용이나 가독성이 떨어짐
		
		int num4 = 0;
		
		if(true) {
			
			int num3 = num1 + num2; //30
		
			// 여기에서 num4의 값을 쓰고 바깥에서 사용하고 싶을 경우엔 num4 선언값을 위로 올리면 됨
			num4 = 1000;
			
		}
		
		// System.out.println(num3); << 선언된 곳이 if 안이라 그 안에서만 사용가능.
		
		int num3 = 100;
		System.out.println(num3);
		System.out.println(num4);
		

		
		
		
		
		
		
		
	}

}
