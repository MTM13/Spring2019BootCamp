package day50.diffPackage;

//create a package called day50.subPackage
import day50.Vehicle;

//add private instance field  wingCount as int and encapsulate this field
public class AirPlane extends Vehicle {
	
// 	protected int year; I have this one because from different package

	// create sub class called Airplane, sub class of vehicle
	private int wingCount;
//	public AirPlane() {
	// super();
	
	
	// create main method and create few objects and print it out
	public static void main(String[] args) {
		AirPlane a1 = new AirPlane("Boeing", "737", 2020, 4);
		System.out.println(a1);
		System.out.println(a1.year);// because we have it as protected 
		System.out.println(a1.getBrand());
		
	  Vehicle v = new Vehicle("F22", "Fantom", 2018);
	  System.out.println(v.toString());// we will get hash code 
	}
	
	
//	}
	// I have them but i don't see them

	
	// add 4 args constructor to set all the fields values
	public AirPlane(String brand, String model, int year, int wingCount) {
		// super(); // it's Complaining because i don't have no arg constructor
		
		
		//we already have functionality to set these 3 fields value
		//so we are just using super class constructor to set these value
		super(brand, model, year);// so i have to create new super to call something i already have it
		
		// could we have done it without above call???????????????????????????
		this.wingCount = wingCount;

//		setBrand(brand);// both way call the set form Vehicle class 
//		this.setModel(model);
		
		// this is the way to call the protector field
		this.wingCount = wingCount;
		
		
		
		
		
		
		//create toString method to print out all the field
        
		
	}
	public String toString() {
		return "AirPlane [wingCount=" + wingCount + ", year=" + year + ", getBrand()=" + getBrand() + ", getModel()="
				+ getModel() + "]";
	}
	
	
	


}
