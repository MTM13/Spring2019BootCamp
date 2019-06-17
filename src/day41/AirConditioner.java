package day41;

public class AirConditioner {

	/*
	 * Create a class called AirConditioner 
	 * add instance field
	 *  brand as string                                                    done
	 * CurrentTemp as float 
	 * isOn as boolean
	 * 
	 * add below behaviors
	 * 
	 * displayTheBrand(); 
	 *  accept no parameter and print out the brand                        done
	 * 
	 * showCurrentTemp 
	 * simply display current temp on console                              done
	 * 
	 * displayAllInfo 
	 * accept no parameter and display all AC info                         done
	 * 
	 * turnOn 
	 * accept no parameter and set isOn value 
	 * to TRUE if it's already true                                        done
	 * 
	 * turnOf accept no parameter and set isOn value 
	 * to false if it's not already true                                   done
	 * 
	 * increaseTemp it accepts one parameter as int and increased the value 
	 * by the amount passed                                                done
	 * 
	 * decreasedTemp it accepts one parameter as int and decreased the value
	 *  by the amount passed                                               done
	 * 
	 * setTemperature it accept one parameter int and set the value to that
	 * parameter passed                                                    done
	 * 
	 * 
	 */

	String brand;
	float currentTemp;
	boolean isOn;

	public void displayTheBrand() {
		System.out.println("the brand is: " + brand);
	}

	public void showCurrentTemp() {
		System.out.println("the current temp is: " + currentTemp);
	}

	public void displayAllInfo() {
		System.out.println("the brand |" + brand + " | the current temp |" + currentTemp);
	}

	public void isOn() {
		System.out.println("current AC is " + isOn);
		if (isOn == false) {
			isOn = true;
		} else {
			System.out.println("is already on ");
		}
	}

	public void isOf() {
		if (isOn) {
			isOn = false;
			System.out.println("it has been turned off !!");
		} else {
			System.out.println("Its already off");
		}
	}

	public void increaseTemp(int Increase) {
		currentTemp = currentTemp + Increase;
	}

	public void decreaseTemp(int Deccrease) {
		currentTemp = currentTemp - Deccrease;
	}
	public void setTemperature(float    target) {
		currentTemp  = target;
	}
	
	
	
	
	
	
}
