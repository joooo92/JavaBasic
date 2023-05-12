package day02;
/**
 * 23.04.13
 */
public class BreakEx03 {
	public static void main(String[] args) {
		
		// 변수를 사용하는 방법
	
		/*
		boolean flag = false; // 탈출을 위한 변수
		
		for(char c = 'A'; c<= 'Z'; c++) {
			for(char l = 'a'; l <= 'z'; l++) {
				System.out.println(c + "-" + l);
				if(l == 'f') {
					flag = true; //탈출을 위해 true
					break;
				}
				
			}
			
			if(flag) break;
			
		}
		*/
		
		//label 방식 >> 라벨(여기선 x) 을 이용하여 탈출.
		x : for(char c = 'A'; c<= 'Z'; c++) {
			for(char l = 'a'; l <= 'z'; l++) {
				
				System.out.println(c + "-" + l);
				if(l == 'f') {
					break x;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
