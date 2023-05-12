package day09.poly.basic02;

public class Student extends Person {

	
	String studentId;
	
	
	Student(String name, int age, String studentId){
		super(name,age);
		this.studentId = studentId;
		
		
	}
	
	
	String info() { //Person의 info에서 Teacher에 맞게 오버라이딩
		return super.info() + ", 학번: " + studentId;
	}
	
	
	
	
}
