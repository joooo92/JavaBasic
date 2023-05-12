package day08.super_2;

public class Employee extends Person {

	
	String department;
	
	Employee(String name, int age, String department){
		super(name,age);
		this.department = department;
	}
	
	
	
	
	
	
	String info() { //Person의 info에서 Teacher에 맞게 오버라이딩
		return super.info() + ", 부서: " + department;
	}
	
	
}
