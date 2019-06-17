package day42;

import java.util.ArrayList;

public class EmployeeActions {

	public static void main(String[] args) {

		Employee e1 = new Employee(); 
		e1.name="Abdul";
		e1.age=100;
		e1.title="Project Manager";
		e1.salary=120000.01;
		e1.printAllInfo();

		Employee e5 = new Employee();
		e5.name = "Abdul";
		e5.age = 100;
		e5.title = "Project Manager";
		e5.salary = 120000.01;

		//e1.salary = 20000;


		Employee e2 = new Employee(); 
		
		e2.age = 23;
		e2.name = "Makintosh";
		e2.salary=99000.0;
		e2.salary = 99000.0;
		e2.title = "Dev";
		e2.printAllInfo();	

		Employee e3 = new Employee(); 
		e3.name="mavlida";
		e3.age=28;
		e3.title="Senior QA";
		e3.salary=100000;
		e3.printAllInfo();

		Employee e4=new Employee();
		e4.name="Enser";
		e4.age=24;
		e4.title="CEO";
		e4.salary=3000000;
		e4.printAllInfo();

		//ArrayList<String> names  = new ArrayList<>(); 



		ArrayList<Employee> myPeople  = new ArrayList<>(); 
		myPeople.add(e1); 
		myPeople.add(e2); 
		myPeople.add(e3); 
		myPeople.add(e4); 
		myPeople.add(  new Employee() ); 

		System.out.println(  myPeople.size() );

		//System.out.println(   myPeople.get(4)  ) ; 
		Employee firstItem = myPeople.get(0); 
		firstItem.printAllInfo();

		Employee secondItem = myPeople.get(1); 
		secondItem.printAllInfo();

		Employee thirdItem = myPeople.get(2); 
		thirdItem.printAllInfo();

		Employee forthItem = myPeople.get(3); 
		forthItem.printAllInfo();	

		Employee e7 = new Employee();
		e7.name = "mavlida";
		e7.age = 28;
		e7.title = "Senior QA";
		e7.salary = 100000;

		Employee e6 = new Employee();
		e6.name = "Enser";
		e6.age = 24;
		e6.title = "CEO";
		e6.salary = 3000000;

		// ArrayList<String> names = new ArrayList<>();
		ArrayList<Employee> looz = new ArrayList<>();
		looz.add(e1);
		looz.add(e2);
		looz.add(e3);
		looz.add(e4);
		looz.add(new Employee());

		for (int i = 0; i < looz.size(); i++) {

			// store each item -- Employee Object
			Employee each = looz.get(i);
			// calling method using this variable
			each.printAllInfo();

			// myPeople.get(i).printAllInfo();

		}
		System.out.println("\n---// PRINT OUT EMPLOYEES THAT MAKE MORE TNAN 100K --------");

		for (int i = 0; i < looz.size(); i++) {

			// store each item -- Employee Object
			Employee each = looz.get(i);

			if (each.salary >= 100000) {
				// calling method using this variable
				each.printAllInfo();
			}
			// myPeople.get(i).printAllInfo();

		}

		System.out.println("\n------// COUNT EMPPLOYEE THAT YOUNGER THAN 30 ---------");
		int youngFolkCount = 0;

		for (Employee each : looz) {

			if (each.age < 30)
				youngFolkCount++;

		}
		System.out.println(" young 25 year old Folk Count is  " + youngFolkCount);

		System.out.println("\n------// SAVE THE NAME OF ALL EMPLOYEE \n"
				+ "		// WHO ARE MORE THAN 25 INTO A String VARIBALE NAMES---------");

		String names = "";

		for (int i = 0; i < looz.size(); i++) {

			// Employee each = myPeople.get(i);
			if (looz.get(i).age > 25) {
				names = names + looz.get(i).name + ",";
			}

		}

		System.out.println("\n------more than 25---------\n" + names);

		System.out.println("\n------Raise the salary of Employee with name who is younger than 100 by 20K---\n");
		for (int i = 0; i < looz.size(); i++) {

			Employee each = looz.get(i);

			if (each.name!=null && each.age < 100) {

				each.salary += 20000; 
				each.printAllInfo();
			}

		}

		Employee fifthItem = looz.get(4); 
		fifthItem.printAllInfo();


	}

}
