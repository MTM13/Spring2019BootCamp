package day24;

public class ArrayPractice2 {

	public static void main(String[] args) {

		int MyName3[] = { 1, 4, 6, 8, 9 };
		for (int i = 0; i < MyName3.length; i++) {

		//MyName3[2] *=  2;

		//MyName3[3] = MyName3[0] + MyName3[1];
        
			//Swap without temp
//		MyName3[0] = MyName3[0] + MyName3[4];
//		MyName3[4] = MyName3[0] - MyName3[4];
//		MyName3[0] = MyName3[0] - MyName3[4];
        
			
			// Swap with temp
			int temp = MyName3[MyName3.length-1];
			MyName3[MyName3.length-1]=MyName3[0];
			MyName3[0]=temp;
			
			
			
			
			System.out.print(MyName3[i] + " " );

		}
		System.out.println();

	}
}