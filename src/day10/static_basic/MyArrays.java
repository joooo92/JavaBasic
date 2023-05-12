package day10.static_basic;

public class MyArrays {
	
	/*
	 * Arrays클래스의 toString메서드 똑같이만들기
	 * 
	 * 1. 외부에서 객체생성 하지못하도록 생성자에 접근제어자를 붙입니다.
	 * 2. printArray() 생성하는데, 배열을 매개변수로 받아서 toString처럼 리턴되도록 
	 *    메서드 오버로딩 (String) (int) (char)
	 */

	private MyArrays() {}
	
	public static String printArray(String[] str) {
		
		String s = "[";
		for(int a = 0; a < str.length; a++) {
			s += str[a];
			if(a == str.length-1) {
				return s += "]";
			}
			s += ", ";
		}s += "]";
		return s;
	}
	
	public static String printArray(int[] i) {
			String s = "[";
			for(int a = 0; a < i.length; a++) {
				s += i[a];
				if(a == i.length-1) {
					return s += "]";
				}
				s += ", ";
			}s += "]";	
		return s;
	}
	
	public static String printArray(char[] ch) {
			String s = "[";
			for(int a = 0; a < ch.length; a++) {
				s += ch[a];
				if(a == ch.length-1) {
					return s += "]";
				}
				s += ", ";
			}s += "]";
		return s;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
