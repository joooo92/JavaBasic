package day06.import_;

//import day06.fruit.Apple; // 패키지명을 포함한 클래스명
//import day06.fruit.Melon;
import day06.fruit.*; // 패키지 뒤에 *붙이면 해당 패키지 속의 파일은 다 사용가능쓰

public class MainClass {
	public static void main(String[] args) {
		
		Apple app = new Apple();
		Melon melon = new Melon();
		
		int a = 1;
		System.out.println(a);
		System.out.println(melon);
		
	}

}
