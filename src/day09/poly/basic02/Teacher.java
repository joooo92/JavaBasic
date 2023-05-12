package day09.poly.basic02;

public class Teacher extends Person {

	
	String subject;
	
	Teacher(String name, int age, String subject){
		super(name, age);
		
		
		this.subject = subject;
		
		
	}
	
	
	
	
	String info() { //Person의 info에서 Teacher에 맞게 오버라이딩
		//return "이름: " + name + ", 나이: " + age + ", 과목: " + subject;
		return super.info() + ", 과목: " + subject;
	}
	
	
	
	
}
