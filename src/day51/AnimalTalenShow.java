   package day51;
 
 /*
  * Create Animal class 

		with single method called 
		makeNoise accept no parameter return nothing 
		it print out general noise

	Create 2 sub classes 
		Horse 
			override makeNoise method 
			print --> Horse --- Nai Nai Nai

		Dog 
			override makeNoise method 
			print --> Dog --- Woof Woof Woof
	Create a class with main called AnimalTalentShow 

	Create 3 objects of Animal , Dog , Horse 
		 let them make noise

  */
 

public class AnimalTalenShow {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeNoise();
		
		Horse Horse = new Horse();
		Horse.makeNoise();
		
		Dog Dog = new Dog();
		Dog.makeNoise();
		
		
		
	}

}
