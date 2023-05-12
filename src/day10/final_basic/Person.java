package day10.final_basic;

public class Person {
	
	//한번 지정되면 값변경이 안되기 때문에, 초기화를 해야합니다. 
	// 1. 생성자를 통한 초기화 2. 직접초기화
	public final String nation = "대한민국";
	public final String ssn = "123456-1234567";
	public String name;
	
	public Person(String ssn, String name) {
	//	this.ssn = ssn;
		this.name = name;
	}

}
