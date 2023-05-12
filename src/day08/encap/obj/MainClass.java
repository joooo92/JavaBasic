package day08.encap.obj;

public class MainClass {
	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		
		
		//매개변수 넘기는거?
		// Chef를 생성해서 Hotel에게 전달
		//Chef chef = new Chef();
		h.setChef(new Chef());

		Chef c = h.getChef(); //Hotel안에 잇는 Chef를 꺼냄
		c.cooking();
		
		
		
		
	}

}
