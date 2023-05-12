package day06.inherit.good;

public class MainClass {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.age = 20;
		s.name = "홍길동";
		s.studentId = "123123";
		System.out.println(s.info());
		
		
		Teacher t = new Teacher();
		t.age = 45;
		t.name = "이순신";
		t.subject = "123123";
		System.out.println(t.info());
		
		
		Employee e = new Employee();
		e.age = 30;
		e.name = "유관순";
		e.department = "신세계";
		System.out.println(e.info());
		
		
	}

}
