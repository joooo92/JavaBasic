package day11.trycach;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {

	public static void main(String[] args) {
		
		/*
		 * 메서드나 생성자에서 발생되는 예외를 로출문장으로 넘기는 키워드는 throws입니다.
		 * throws구문이 붙어있는 생성자 or 메서드는 예외처리를 대신 진행해야합니다. 
		 * 
		 * 즉, 예외처리를 강요할 때 사용됩니다. 
		 */
		
		
		try {
			greeting(10);
			
		} catch (Exception e) {
			
			System.out.println("에러가 발생햇습니다.");
			e.printStackTrace(); //에러가 발생했을 때 에러로그를 확인하기 위해서 많이 사용합니다.
			//^ 에러 확인을 위해 적어놓는게 좋음. 이게 있다고 프로그램이 멈추는 것은 아니고 에러만 알려줌
		}
		
		//throws의 예시
		try {
			Class.forName("#$#%@%^");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			new FileInputStream("%$@@%");
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		System.out.println("프로그램 정상종료");
	}
	
	private static String[] arr = {"hello", "bye", "say good bye"};
	
	public static void greeting(int index) throws Exception {
		System.out.println(arr[index]);
	}
	
	
	
	
}
