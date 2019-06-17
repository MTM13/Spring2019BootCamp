package day48;

public class Horse extends Animal{
	
	int shoesCount;
	int horesPower;
	
	
	
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.wild = false;
		
		
		System.out.println(a.breed);
		System.out.println(a.legCount);
		
		Horse h = new Horse();
		h.breed = "Spartan";
		h.horesPower = 500;
		System.out.println(h.breed);
		System.out.println(h.horesPower);
		
		
	}
	

}
