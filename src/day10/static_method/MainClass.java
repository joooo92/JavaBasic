package day10.static_method;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
		Count c = new Count();
		c.method01(); //일반
		c.method02(); //static
		
		//static 메서드의 사용
		Count.method02();
		
		//main과 연관지어 생각. main은 static! 같은 static은 바로 호출 가능, 
		// 일반 메서드는 호출해야 가능!
		
		//main 밖에 있는 경우, 다른클래스에 있는것마냥 새로 객체생성하여 데려와야됨
		MainClass ma = new MainClass();
		ma.test();

		//static메서드의 사용예시
		Math.random();
		Arrays.toString(new int[3]);
		Integer.parseInt("안뇽");
		String.valueOf(3); //>> 숫자를 문자열로 바꿔주는,,!
		
		
		
	}
	
	public void test() {
		
	}
	
	
	
}
