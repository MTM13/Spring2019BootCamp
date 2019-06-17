package day50;

public class ExtremSport extends Sport{
	
	// this is the optional annotation to make sure
	// you have overriding the method correctly
	
	
	
	// what we have in overriding from observed here
	// same method name
	//same parameter list
	//same return type
	//this method is in sub class
	// this is an instance method
	
	public void doSport() {
		System.out.println("doing extremSport sport ----- sky diving");
	}
	 
	
	@Override
	public String toString() {
		
		return "Khlanz"; // but if I comment toString off I will get hash code!!!!!
	}
	public static void main(String[] args) {
		ExtremSport e = new ExtremSport();
		e.doSport();
		System.out.println(e.toString());
	}

}
