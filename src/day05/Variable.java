package day05;
/**
 * 23.04.20
 */
public class Variable {
	// v멤버변수
	int a = 1; // 선언과 동시에 초기화는 가능
	//a = 10; 이런거는 불가능한 문법. 이렇게 초기화를 하는건 메인 안으로 들어가야 가능
	String b;
	
	void printNum(int d) {
		
		int c = 1; //지역변수
		
		System.out.println("멤버변수: " + a);
		System.out.println("멤버변수: " + b);
		System.out.println("지역변수: " + c);
		System.out.println("지역변수(매개변수): " + d);
		
		
		
	}
	
	

}
