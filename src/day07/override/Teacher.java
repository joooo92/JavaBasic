package day07.override;

public class Teacher extends Person {

	
	String subject;
	
	String info() { //Person의 info에서 Teacher에 맞게 오버라이딩
		return "이름: " + name + ", 나이: " + age + ", 과목: " + subject;
	}
	
	
	
	
}
