package day39;

import java.util.Arrays;

public class Horse {

	String breed;
	int age;
	String color;
	double height;
	
	public static void main(String[] args) {
		
		
		Horse h1 = new Horse();
		h1.age = 4;
		h1.height = 5.10;
		h1.color = "black";
		h1.breed = "mongolian horse";
		

		Horse h2 = new Horse();
		h2.age = 3;
		h2.height = 5.70;
		h2.color = "brown";
		h2.breed = "iraqi horse";
		
		System.out.println(h1);
		
	}

}
