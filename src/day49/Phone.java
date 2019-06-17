package day49;

public class Phone extends Device{
	String brand;
	int screenSize;
	
	/*
	 * what the difference between super and this?
	 * this(arg..) is used 
	 */
	public Phone() {
	//super();
	super(100);
	System.out.println("Phone  constructor");
	}
	
	
	
	
	public static void main(String[] args) {
		 
		
		Phone P = new Phone();
		
		
		
		
		
		
		
		
		
	}

}
