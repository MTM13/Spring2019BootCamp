package day43;

public class Vehicel {

	// <this> keyword can be used to address 
			// the current object|instance being worked on 
			private String make;
			private int speed;
			private String model;



  
			// right click -- 
			// select source 
			// select generate getters and setters 
			// check the checkbox for the field you wanna generate
			// then click generate 
			public String getMake() {
				return make;
			}
			
			public void setMake(String make) {
				this.make = make;
			}
			
			public int getSpeed() {
				return speed;
			}
			
			public void setSpeed(int speed) {
				this.speed = speed;
			}
			
			public String getModel() {
				return model;
			}
			
			public void setModel(String model) {
				this.model = model;
			}
			public void increaseSpeed(int increaseBy) {
				// speed = speed + increaseBy;
				for (int i = 1; i <= increaseBy; i++) {
					speed++ ;
					System.out.print(speed + "->");
				}
				System.out.println();
			}
			
			public void decreaseSpeed(int decreaseBy) {
				
				for (int i = 1; i <= decreaseBy; i++) {
					speed-- ;
					System.out.print(speed + "->");
				}
				System.out.println();
			}
			
			public void stop() {
				
//				speed = 0 ;      // direct way
				this.speed = 0 ; // using this keyword
//				setSpeed(0);
//				this.setSpeed(0);
				
				
			}
			
			
		}