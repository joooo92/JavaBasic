package day02;
/**
 * 23.04.13
 */
public class ContinueEx01 {
	public static void main(String[] args) {
		
		//continue는 반복문을 건너뜀(예시에서는 5는 건너뛰고 다음 반복문,,)
		
		//1. for문에서는 증/감식으로 이동합니다. 
		/*for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		*/
		
		//2. while문에서는 continue는 조건식으로 갑니다. 
		int i = 1;
		while (i <= 10) {
			
			if(i == 5) {
				i++; // continue 위에 증감을 넣으면 중간에 멈추지않고 위의 for문처럼 끝까지 진행.
				continue;
			}
			
			System.out.println(i);
			
			i++;
		}
		
		
		
		
		
		
		
		
	}

}
