package day11.trycach;

public class MultiCatchEx01 {
	public static void main(String[] args) {
		
		//참고
		//메인메서드도 매개변수를 받을 수 있음
		// run > run configuration > argument > ${string_prompt}
		
		try {
			String a1 = args[0];
			String a2 = args[1];
			
			//매개변수로 문자를 받아서 정수로 변경해주는 Integer.parseInt( ) : 
			int num1 = Integer.parseInt(a1);
			int num2 = Integer.parseInt(a2);
			
			System.out.println("두 수의 합: " + (num1 + num2));
			
			String str = null;
			str.charAt(0);
			
			
			
			
		//catch문에는 에러를 처리할 정확한 에러클래스가 선언됩니다. 
		//Exception은 모든 예외클래스의 부모클래스 입니다. 이에, 모든 예외를 처리할 수 있슴!!
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어남(매개변수를 2개 입력하세요)");
		} catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		} catch(Exception e) { // ctrl + t
			System.out.println("기타예외입니다.");
		}
		
	}

}
