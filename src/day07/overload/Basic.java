package day07.overload;

public class Basic {

	/*
	 오버로딩 - 같은이름의 메서드를 여러개 생성하는 것
	 
	 규칙
	 1. 이름은 똑같음
	 2. 매개변수를 다르게 해서 모형을 다르게 해야합니다.
	 3. 반환유형은 오버로딩에 영향을 미치지 않습니다.
	 */
	
	void input(int a) {
		System.out.println("정수 1개 입력받음");
	}
	
	
//	v 이름은 같으나, 반환유형이 동일하여 안됨
//	int input(int x) {  
//		return 0;
//	}
	
	// 이름이 같아도 v처럼 매개변수가 다를경우 가능
	void input(String a) {
		System.out.println("문자열 1개 입력받음");
	}
	
	// 매개변수의 갯수가 늘어나도 상관없음
	void input(int a, double b) {
		System.out.println("정수 1개, 실수 1개 입력받음");
	}
	
	// ^ 와 매개변수의 위치가 바뀌면 가능
	void input(double a, int b) {
		System.out.println("실수 1개, 정수 1개 입력받음");
	}
	
	void input(int a, char b, double c) {
		System.out.println("정수 1개, 문자 1개, 실수 1개 입력받음");
	}
	
	
}
