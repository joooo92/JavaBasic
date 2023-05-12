package day07.override;

public class MainClass {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.age = 20;
		s.name = "홍길동";
		s.studentId = "123123";
		System.out.println(s.info()); // 오버라이딩
		
		
		Teacher t = new Teacher();
		t.age = 45;
		t.name = "이순신";
		t.subject = "국사";
		System.out.println(t.info()); // 오버라이딩
		
		
		Employee e = new Employee();
		e.age = 30;
		e.name = "유관순";
		e.department = "운영팀";
		System.out.println(e.info()); // 오버라이딩
		
		
	}

}
