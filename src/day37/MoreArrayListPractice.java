package day37;

import java.util.ArrayList;

public class MoreArrayListPractice {

	public static void main(String[] args) {

		ArrayList<Integer> name = new ArrayList<>();

		name.add(100);
		name.add(200);
		name.add(300);
		name.add(400);
		System.out.println(name);
		name.add(1, 500);
		System.out.println(name);
		name.set(2, 600);
		System.out.println(name);
		System.out.println(name.contains(250));
		int IndexOf600 = name.indexOf(600);
		System.out.println(IndexOf600);
		System.out.println("The size of the list "+name.size());
		name.remove(Integer.valueOf(500));
		System.out.println(name);
		name.clear();
		System.out.println(name);
        boolean IsEmptyOrNot = name.isEmpty();
        System.out.println(IsEmptyOrNot);
	}
}
