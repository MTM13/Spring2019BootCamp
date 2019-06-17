package day33;

public class gradeScore {

	public static void main(String[] args) {
		System.out.println(gradeScore(91));
		
		
		
	}
	public static char gradeScore(int score) {
		if(score >= 90) return 'A';
		if(score >= 80) return 'B';
		if(score >= 70) return 'C';
		
		
		return 'F';
		
		
	}
}
