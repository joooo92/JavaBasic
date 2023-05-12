package day11.inter.basic3;

public class MainClass {
	public static void main(String[] args) {
		
		Printed pt = new Samsung();// new LG();  << 삼성과 엘지가 결과가 다르게 호출되부림
		
		pt.print("hello world");
		pt.colorPrint("hello world", "파란색");
		int result = pt.copy(5);
		
		
		
		
		
	}

}
