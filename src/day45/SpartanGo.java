package day45;

import java.util.Arrays;

public class SpartanGo {

	public static void main(String[] args) {
	
		
		
		Spartan s1 = new Spartan();
		System.out.println(s1);
		
		
		
		
		
		String[] certs = {"OCA","PSM","AWS","OCP"};
		Spartan s2 = new Spartan("Coder", 8, 600,false, certs);
		Spartan s3 = new Spartan("Coder1", 18, 700, false, new String[] {"OCA"});
		Spartan s4 = new Spartan("Coder2", 12, false, certs);
		Spartan s5 = new Spartan("Coder3", 3, True, certs);
		System.out.println(Arrays.toString(certs));
	}

}
