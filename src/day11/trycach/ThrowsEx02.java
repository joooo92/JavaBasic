package day11.trycach;

public class ThrowsEx02 {
	
	public ThrowsEx02() throws Exception{
		System.out.println("생성자 시작");
		aaa();
		System.out.println("생성자 종료");
		
	}
	
	public void aaa() throws Exception{
		System.out.println("aaa 시작");
		bbb();
		System.out.println("aaa 종료");
	}
	
	
	
	public void bbb() throws Exception{
		System.out.println("bbb 시작");
		System.out.println(10 / 0);
//		try {
//			
//		} catch (Exception e) {
//			System.out.println("예외처리 끝");
//		}
		System.out.println("bbb 종료");
	}
	
	//main
	public static void main(String[] args){
		
		try {
			ThrowsEx02 ex = new ThrowsEx02();
			
		} catch (Exception e) {
			System.out.println("예외처리 끝");
		}
		
	}
	
	
	


}
