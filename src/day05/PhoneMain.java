package day05;
/**
 * 23.04.20
 */
public class PhoneMain {
	public static void main(String[] args) {
		
		Phone black = new Phone();
		black.info();
		
		Phone pink = new Phone("아이폰14");
		pink.info();
		
		Phone red = new Phone("아이폰14 max", "빨간색");
		red.info();
		
		Phone white = new Phone("아이폰13", 250000);
		white.info();
		
		
		//model, color, price를 매개변수로 받아서 초기화하는 생성자를 만들어보세요
		//객체생성도 해보세요
		
		Phone green = new Phone("아이폰13", "초록색", 320000);
		green.info();
		
		
		
		
		
		
		
		
		
	}

}
