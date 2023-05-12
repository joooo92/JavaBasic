package day08.encap.good;

public class MainClass {
	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		//me.day = 2022;
		me.setYear(2022);
		int year = me.getYear();
		System.out.println(year);
		
		me.setMonth(12);
		me.setDay(30);
		me.setSsn("920714-2111111");
		
		int month = me.getMonth();
		System.out.println(month);
		int day = me.getDay();
		System.out.println(day);
		String ssn = me.getSsn();
		System.out.println(ssn);
		
		
		
		
	}

}
