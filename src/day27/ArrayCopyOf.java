package day27;

import java.util.Arrays;

public class ArrayCopyOf {

	public static void main(String[] args) {

       /*
        * sort this array
        * use for each loop to loop through all of them
        * if this array has the hero you are looking for
        * print bingo!
        */
		String [] dcComicHeros = {"Superman",
				           "Batman", 
				           "Aquaman",
				           "Wonder Women",
				           "The Flash",
				           "Green Lantern"};
		
		String [] herosCopy = new String [dcComicHeros.length];
		for (int i = 0; i < herosCopy.length; i++) {
			herosCopy[i] = dcComicHeros[i];
		}
		
		Arrays.sort(dcComicHeros);
		System.out.println(Arrays.toString(herosCopy));
		System.out.println(Arrays.toString(dcComicHeros));
		
		for (String hero  :  dcComicHeros) {
		//	System.out.println(hero);
			if(hero.contains("Superman")) {
			
			System.out.println("Bingo!");
		}
    }  
		
		
		
		
		
		}

	}


