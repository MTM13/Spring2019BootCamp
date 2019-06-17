package day27;

import java.util.Arrays;

public class CopyArray2 {

	public static void main(String[] args) {
		String [] dcComicHeros = {"Superman",
		           "Batman", 
		           "Aquaman",
		           "Wonder Women",
		           "The Flash",
		           "Green Lantern"};
		System.out.println(Arrays.toString(dcComicHeros));
		String [] copyOf = Arrays.copyOf(dcComicHeros,3);
		System.out.println(Arrays.toString(copyOf));

	}

}
