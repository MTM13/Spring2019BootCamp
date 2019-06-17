package day41;

public class EstyAccount {

	private String name;
	private String Email;
	private String password;

	public String getEmail() {

		return Email;
	}

	public void setEmail(String newEmail) {
		Email = newEmail;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;

	}

	public String getPassword() {
		return password;
	}
    
	public void setPassword(String newPassword) {
		
		if(newPassword.length()  < 6) {
			System.out.println("password must be morethan 6 char");
		}
		password = newPassword;
	}

}
