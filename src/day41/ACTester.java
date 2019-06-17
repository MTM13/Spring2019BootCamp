
package day41;

public class ACTester {

	public static void main(String[] args) {

		AirConditioner ac = new AirConditioner();

		ac.brand = "Samsung";
		ac.currentTemp = 79.6f;
		ac.isOn = true;
		ac.displayTheBrand();
		ac.displayAllInfo();

		ac.isOn();
        ac.increaseTemp(10);
        ac.decreaseTemp(25);
        ac.showCurrentTemp();
		
		
		
		
		
		
	}

}
