package day08.encap.good;

public class MyDate {
	

	private int year;
	private int month;
	private int day;
	private String ssn; //주민번호

	/*
	 * 은닉된 변수에 접근할 때, 미리 생성해놓은 
	 * getter / setter 를 사용합니다.
	 * 
	 * setter 메서드
	 * 1. 값을 저장하는 용도의 에서드
	 * 2. 접근제어자는 public으로 선언하고 이름은 (set + 멤버변수명) 으로 지정
	 */
	
	/*==============================================================
	 * 1. month, day, ssn에 getter/setter생성
	 * 
	 * month - 1~12월 까지만 자장
	 * day - 1~31일까지만 저장
	 * ssn - 하이픈은 제거하고 13자리까지만 저장가능. replace() , length()
	 *==============================================================*/
	
	public void setYear(int year) {
		
		if(year < 1900 || year > 2023) {
			System.out.println("잘못된 값 입력인데요?");
			return;
		}else {
			this.year = year;			
		}	
	}
	
	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			System.out.println("잘못된 값 입력인데요?");
			
		}else {
			this.month = month;			
		}	
	}
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println("잘못된 값 입력인데요?");
			
		}else {
			this.day = day;
		}
	}
	
	public void setSsn(String ssn) {
		ssn = ssn.replace("-", "");
		
		if(ssn.length() != 13) {
			System.out.println("주민번호는 13자리 입니다.");
			
		}else {
			this.ssn = ssn;
		}
	}
	
	
	
	
	
	
	/*
	 * getter메서드
	 * 1. 은닉변수의 값을 조회하는 메서드
	 * 2. 접근제어는 public, 반환유형이 있고, 이름은 get + 멤버변수명
	 */
	
	
//	접근제어자 반환유형 메서드명() {
//		}
	public int getYear() {
		return year;
	}
	

	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	
	
	
	
	
	
	
}
