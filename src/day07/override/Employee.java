package day07.override;

public class Employee extends Person {

	
	String department;
	
	String info() { //Person의 info에서 Teacher에 맞게 오버라이딩
		return "이름: " + name + ", 나이: " + age + ", 부서: " + department;
	}
	
	
}
