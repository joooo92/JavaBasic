package day11.inter.basic;

public class Basic implements Inter1, Inter2{
	//^ 인터페이스를 상속받을 떄는 implements키워드를 씁니다.
	//v 인터페이스에 있는 추상메서드는 반드시 오버라이딩 되야합니다.
	// 인터페이스는 다중상속이 됩니다. 
	
	
	@Override
	public void method01() {
		System.out.println("재정의된 1번 메서드 사용");
	}

	@Override
	public void method02() {
		System.out.println("재정의된 2 번 메서드 사용");	
	}
	
	public void method03() {
		System.out.println("나의 3번 메서드 사용");
	}
	
	
	
}
