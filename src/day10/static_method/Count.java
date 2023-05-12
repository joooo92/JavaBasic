package day10.static_method;

public class Count {
	
	public int a;
	public static int b;

	//일반메서드 - 일반멤버와 정적멤버 모두 사용이 가능
	public int method01() {
		a = 10;
		b++;
		return b;
	}
	
	//정적메서드 - 일반멤버를 사용할 수 없음, 정적멤버는 사용이 가능
	//			단, 객체생성을 통해서는 일반멤버 사용이 가능.
	public static int method02() {
		//a = 10; // a를 바로 사용할 수가 없음. 이유 : static이 생성될 당시에 a변수는 없기때문에.
		Count c = new Count(); // < 이렇게 직접 객체를 생성할 경우엔 가능.
		c.a = 10;
		b++;
		
		return b;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
