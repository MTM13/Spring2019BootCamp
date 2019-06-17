package day32;

public class Utility {

	public static void main(String[] args) {
		
//		String name = "Emine";
//		
//		System.out.println(name.charAt(1));
		
		// there are two ways to call static methods
		//1- if the method is in same class we can just directly call the method by
		
		// we can use directly static method (parameter) to call static method
		System.out.println(giveMe5());
		
		//we can use className.static method (parameter) to call static method
		System.out.println(Utility.giveMe5());
		
		int myNum = giveMe5();
		System.out.println(myNum);
		
		
	}
     public static int giveMe5() {
    	 
    	 return 5 ;
    	 
     }
	
	
	
	
	
	
}
