package day29;

public class MethodWithParameter {

	public static void main(String[] args) {
		// Arrays.sort(arr) ;     
	    holdYourHorse("Anar"); 
	    //holdYourHorse(12321);  // does not compile if datatype not match
	    holdYourHorse("David"); 
	    holdYourHorse("Fatma"); 
	    holdYourHorse("Sumeyye"); 
	    
	  }
	                  // parameter 
	  public static void holdYourHorse(String owner) {  
	     //String owner = "Anar" ;
	     System.out.println(owner + ", hold your horse please!");       
	  }
	  

	}
