package day50;

public class Vehicle {

	
	private String brand;
	private String model;
	protected int year;
	
	// add constructor to set all fields values 
	public Vehicle(String brand, String model, int year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	// provide getters and setters for only private fields
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
// create a package called day50.subPackage

// create sub class called Airplane, sub class of vehicle
//add private instance field  wingCount as int and encapsulate this field
// add 4 args constructor to set all the fields values
//create toString method to print out all the field
// create main method and create few objects and print it out