package day49;

public class Employee extends Object{
	// if a class does not extends another class explicitly
	// if will extends a class called object implicitly
	
	private String title;
	private int id;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Spartan";
	}
	
	

}
