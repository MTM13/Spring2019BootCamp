package day24;

public class Max {

	public static void main(String[] args) {
		int Num []= {1,4,6,8,9,5};
		int max = Num[0];
		for (int i = 1; i < Num.length; i++) {
			if(Num[i] > max) {
				max = Num[i];
			}
		}
        System.out.println(max);
	}

}
