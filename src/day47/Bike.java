package day47;
   /*
    * create a class called Bike
    * 
    * private instance fields : brand, gear, speed, ID
    * private static field : countOfBike
    * 
    * provide getters for all instance fields
    * provide setters for brand , gear, speed
    * 
    * create 3 args constructors to set brand , gear, speed
    * and keep the count of objects here and call the constructor here
    * 
    * set the ID value by the count of object to stimulate incremented ID for each object
    * call your no arg constructor in here
    * 
    * create private no arg constructor 
    * print out "no arg is being called"
    * 
    *  craete instance methods 
    *  sppedUp :
    *  accept one increaseBy as int
    *  return nothing, it will increase current speed by the amount provided
    *  
    *  slowdown : accept one decreaseBy as int
    *  return nothing , it will decrease current speed
    *  byb amount provided 
    *  
    *  toString method as usual 
    *  
    *  create static methods showCurrentCount
    *  accept no arg and just print out static variable count
    *  
    *  create a class Marathon with main method 
    *  
    *  create few object and try to call their methods
    *  
    */

public class Bike {
	private String brand; 
	private int gear;
	private int speed;
	private int id;

	private static int countOfBike ;


	private Bike() {
		//System.out.println("no arg constructor is being called");
		++countOfBike ;
		this.id += countOfBike; 
	}
	
	public Bike(String brand, 
			   int gear, int speed) {
		this();
		this.brand = brand;
		this.gear = gear;
		this.speed = speed;
//		++countOfBike ;
//		this.id = countOfBike; 
	}
	public static void showCurrentCount() {
		
		System.out.println("Current Count of Object is "
				+ countOfBike);
			
	}
	
	public static void resetCount() {
		countOfBike = 0 ; 
	}
	
	
	public void speedUp(int increaseBy) {
		speed=speed+increaseBy;
	}
	public void slowdown(int decreaseBy) {
		speed=speed-decreaseBy;
	}
	
	
	
	public String toString() {
		return "Bike [brand=" + brand + ", gear=" + gear + ", speed=" + speed + ", id=" + id + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getId() {
		return id;
	}
	
	
}