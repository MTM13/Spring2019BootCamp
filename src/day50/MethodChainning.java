package day50;

public class MethodChainning {

	public static void main(String[] args) {
		
		
		methodA();

	}

	
	public static void methodA() {
		
		methodB();
		System.out.println("A called");
	}
	
	public static void methodB() {
		System.out.println("B called");
        methodC();
	}
	
	public static void methodC() {
		System.out.println("C called");
	}
}
