package day49;

public class WarmUp {

	public static void main(String[] args) {
		
		AudioBook a1 = new AudioBook();
		a1.author = "the hunger games";
		a1.price = 12.99;
		a1.AudioLength = 3;
		a1.pageCount = 300;
		a1.play();
		a1.printAuthor();
		
		
		paperBook p1 = new paperBook();
		p1.author = "khlanz";
		p1.chapterCount = 34;
		p1.weight = 0.750;
		p1.hardcover = true;
		p1.printAuthor();
		
		
		
		

	}

}
