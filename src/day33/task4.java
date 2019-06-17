package day33;

public class task4 {

    /*
     * create a method that take one strin parameter
     * as sentence and return first character for 
     * first word and all characters of the last word except first char
     * example : Love java ----> Lava 
     */
      
	public static void main(String[] args) {
		String sentence = "Love Java";
		System.out.println(getMyString(sentence));

	}
	public static String getMyString(String sentence) {
		String firstChar = sentence.substring(0, 1);
		String [] allWords = sentence.split(" ");
		String lastWords = allWords[allWords.length-1];
		String targetWord = firstChar + lastWords.substring(1);
		return targetWord;
	}
}
