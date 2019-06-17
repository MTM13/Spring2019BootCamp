package day51;

public class JavaAssesment extends Assesment {

	int level;
		
		
		
		public static void main(String[] args) {
   //static way to access.timeLimit	
	System.out.println(Assesment.timeLimit);
   //accessing inherited static field directly in static method
	System.out.println(timeLimit);
   //accessing inherited static field in static way
	// using this class name
	System.out.println(JavaAssesment.timeLimit);
	timeLimit=50;
	
	Assesment.printTimeLimit();
	printTimeLimit();
	JavaAssesment.printTimeLimit();
		}
	
	
}
