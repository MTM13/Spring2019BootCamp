package day51;

public class Assesment {
	int questionCount;
	int score;
	String type;
	
	
	static int timeLimit=45;
	
	
	// static method can only access static members 
	public static void printTimeLimit() {
		System.out.println("time Limit "+ timeLimit);
		
	}


	public String toString() {
		return "Assesment [questionCount=" + questionCount 
				        + ", score=" + score + ","
						+ " type=" + type + "]"; 
		
		
	}
	

}
