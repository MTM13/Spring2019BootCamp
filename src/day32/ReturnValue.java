package day32;

public class ReturnValue {

	public static void main(String[] args) {


		 giveMeLastChar("looooz");
		 

	}

	public static char giveMeLastChar(String name) {
		
		char last = name.charAt(name.length()-1);
		System.out.println(last);
		return last;
	}
	
	
}
