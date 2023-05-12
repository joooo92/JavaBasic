package day03;

import java.util.Scanner;

public class Reeeeee {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		// 학생정보를 등록할 배열을 while문 바깥에 선언
		String[] nameList = new String[100];
		int[] ageList = new int[100];
		String[] infoList = new String[100];
				
		// 고객수 (사람수)
		int count = 0;
		// 조회할 위치
		int index = -1;
		
		
					
		while(true) {
			System.out.println("[정보]고객수: " + count + ", 조회위치: " + index);
			System.out.println("[메뉴]1.추가, 2.이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7.종료");
			System.out.println("===============================================================");
			System.out.println("메뉴입력> ");
			String menu = scan.next();
			
			switch(menu) {
			case "추가" :
			case "1" :
				/* 추가:
				 * 이름, 성별, 간단한 정보를 입력받아서 각각의 배열에 순서대로 저장될 수 있게 처리합니다.
				 * count를 증가합니다.
				 */
//				index++;
//				
//				System.out.print("이름: ");
//				String name = scan.next();
//				nameList[index] = name;
//				
//				System.out.print("나이: ");
//				int age = scan.nextInt();
//				ageList[index] = age;
//				
//				System.out.print("간단한 정보: ");
//				String info = scan.next();
//				infoList[index] = info;
				
		
				break;
				
			case "2" :
				/*
				 * 이전정보 출력:
				 * 이전정보출력은 index위치로 출력합니다.
				 * 이전정보출력을 누르면 index를 -1 시키고 해당위치에 정보를 출력.
				 * 조건 
				 * index가 0보다 작다면, 출력하지 않도록 처리. 
				 */
//				index --;
//				if(index >= 0) {
//					System.out.println("인덱스위치: " + index);
//					
//				} else {
//					System.out.println("정보가 없습니다.");
//					
//				}
				
		
				
				
				break;
				
			case "3" :
				/*
				 * 다음정보출력:
				 * 다음정보출력은 index위치로 출력합니다. 
				 * 다음정보출력을 누르면 index를 +1 시키고 해당위치에 정보를 출력
				 * 조건
				 * count -1 보다 index가 같거나 크다면, 출력하지 않도록 처리
				 */
//				index ++;
//				if(count -1 <= index) {
//					System.out.println("정보가 없습니다.");
//					
//				} else {
//					System.out.println(index);
//					
//				}

		
				
				break;
				
			case "4" :
				/*
				 * 현재정보 출력
				 * index가 가르키고있는 위치정보를 출력.
				 * 
				 * 조건 
				 * 출력할 수 있는 조건을 생각해서 처리
				 * 
				 */
		
			
				
				
				break;
				
			case "5" :
				/*
				 * 정보수정
				 * 새로운 이름, 나이, 정보를 입력받아서 
				 * 현재 위치를 수정해주면 됩니다. 
				 * 
				 * 조건
				 * 4번과 동일
				 */
				
				
				
				
				
				break;
				
			case "6" :
				/*
				 * 현재정보 삭제
				 * 현재 삭제하려는 index부터 ~~~뒤에잇는 배열요소를 당여와서 덮어 씌웁니다.
				 * 
				 * 삭제시 사람수도 같이 감소시켜줘야함
				 * 
				 * 조건
				 * 4번과 동일
				 */
				
				
				
				
				
				
				break;
				
			case "7" :
				// while문 탈출
				
//				if(while == false) {
//					System.out.println("종료하겠습니다");
//				}
				
				
				break;
				
			default :
				System.out.println("잘못입력했습니다.");
				break;
				
				
				
				
			}
			
			
		}
		
		
		
		
	}


	}


