package day01;

public class Bye {

	public static void main(String[] args) {
		
		// main이라 쓰로 ctrl + space 를 누르면 실행함수가 만들어 집니다. 
		/*
		 * ctrl + s 저장
		 * ctrl + f11 실행
		 * sysout 이라 적고 ctrl + space 출력문 자동완성
		 * 
		 * 코드이동 : alt + 방향키
		 * 코드복사 : ctrl + alt + 방향키(위아래 화살표)
		 * 되돌리기 : ctrl + z
		 * 전체선택 : ctrl + a  
		 * 전체선택 + 정렬 : ctrl + a, ctrl + i
		 * 한줄삭제 : ctrl + d
		 */ 
		 
		System.out.println("출력문 자동완성");
		System.out.println(1); // 숫자
		System.out.println("1"); // 문자(문자열)
		
		
		// 자바의 출력문의 종류 - 3가지 제공
		// 개행문자 \n 가 없는 출력
		System.out.print("hi");
		System.out.print("hi");
		System.out.print("\n");
		System.out.print("hi");
		
		// 개행문자를 마지막에 포함해주는 println
		System.out.println("맨 뒤에 줄바꿈이 붙습니다");
		System.out.println("맨 뒤에 줄바꿈이 붙습니다");

		// 형식 지정 출력문 printf
		// 내가 출력하고 싶은 문자열에 구멍을 뚫어놓고 사용하는 방식
		/*
		 * %d - 정수를 대입할 수 있음
		 * %f - 실수를 대입할 수 있음 (소숫점 6자리까지 나옴. 뒤 숫자가 없다면 0으로 나옴)
		 *                          
		 * %s - 문자를 대입할 수 있음
		 *  
		 * \n : 줄바꿈
		 * \t : 8칸 공백을 잡고 정렬
		 */
		
		System.out.printf("제 이름은 %s 입니다.\n", "홍길동");
		System.out.printf("원주율은 %f 입니다.\n", 3.1443455213);
		System.out.printf("원주율은 %.2f 입니다.\n", 3.1443455213);
		System.out.printf("오늘은 %d일 입니다.\n", 7);
		
// 제 생일은 xxxx년 xx월 xx일 입니다 - 출력하기
		System.out.printf("제 생일은 %d 년 %d월 %d 일 입니다.", 1992,07,14 );
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
