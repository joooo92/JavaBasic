package day11.inter.basic2;

public class MainClass {
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Animal[] animals = {dog, cat, tiger};
		
		for(Animal ani : animals) {
			ani.eat(); //Animal의 기능
		}
		
		//dog, cat은 인터페이스 타입으로 형변환이 됩니다.
		//dog, cat, goldfish를 저장하고, IPet의 기능을 사용
		IPet[] pets = new IPet[3];
		
		pets[0] = (IPet)dog;
		//pets[1] = (IPet)tiger; tiger은 IPet의 기능이 없기때문에 err!
		pets[1] = (IPet)cat;
		pets[2] = new GoldFish();
		
		for(IPet ip : pets) {
			ip.play();
		}
		
		System.out.println("================================");
		
		PetHouse.carePet((IPet)dog);// 초반에 Animal에 넣었고, 그뒤 IPet은 형변환 한거라 여기도 형변환 한거에 넣어야됭
		PetHouse.carePet((IPet)cat);
		PetHouse.carePet(pets[2]);//물고기
		
		
		
		
		
		
	}

}
