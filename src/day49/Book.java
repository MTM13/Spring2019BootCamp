package day49;


     /* 
      * create a class call Book
      * pageCount , author, chapterCount, price
      * 2 sub classes of the Book
      * create sub class of Book
      * AudioBook
      * pageCount , author, chapterCount, price, audioLength
      * paperBook
      * pageCount , author, chapterCount, price, weight, hardCover
      * 
      * inside your main method 
      * create few object and see what you can access 
      * try different access modifier and see what error you will get
      */
public class Book {
	
	protected int pageCount;
	 String author;
	 int chapterCount;
	 double price;
	 
	 public void printAuthor() {
		 System.out.println("name " + author);
		 
	 }
	
	
	
	
	
	

}
