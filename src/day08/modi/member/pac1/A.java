package day08.modi.member.pac1;

public class A {
	
	//사용
	A a = new A(); // public O
	A a2 = new A(1); // default O
	A a3 = new A("홍길동"); // private O 
	
	
	//생성자
	A(int i) {}
	private A(String s) {}
	
	public A() {
		this.var1= 1;
		this.var2= 2;
		this.var3= 3;
		
		method1();
		method2();
		method3();
	}

	
	
	
	
	// 멤버변수 메서드
	public int var1;
	int var2;
	private int var3;
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	
	
	
	

}
