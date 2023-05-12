package day07.this_;

public class Student extends Person {

	
	String studentId;
	
	
	Student(String name, int age, String studentId){
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		
		
	}
	
	
	String info() { //Person의 info에서 Teacher에 맞게 오버라이딩
		return "이름: " + name + ", 나이: " + age + ", 학번: " + studentId;
	}
	
	
	
	
}
