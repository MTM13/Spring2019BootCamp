package day41;

public class TeacherAction {

	public static void main(String[] args) {

		Teacher akbar = new Teacher();

		
		// fields are private we can not access
		
		// System.out.println(akbar.name);
		// System.out.println(akbar.Specialty());
      
		// to set new value
		akbar.setName("akbar");
		akbar.setSpecialty("magic");
		
//		System.out.println(akbar.getName());
// 		System.out.println(akbar.getSpecialty());
		
		
		// to update the value again
         akbar.setName("Magic Man");
 		akbar.setSpecialty("Realse ya teaz");
 		
 		System.out.println(akbar.getName());
 		System.out.println(akbar.getSpecialty());
		
		
	}

}
