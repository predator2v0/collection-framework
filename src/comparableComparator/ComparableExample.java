package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int id, ram;
		String model;
		Float price;
		ArrayList<Mobile> alMob= new ArrayList<>();
		System.out.println("enter number of items:");
		int quantity = s.nextInt();
		for(int i = 0; i<quantity; i++) {
			System.out.println("mob id:");
			id = s.nextInt();
			System.out.println("mob model:");
			model = s.nextLine();
			s.nextLine();
			System.out.println("mob ram:");
			ram = s.nextInt();
			System.out.println("mob price:");
			price = s.nextFloat();
			alMob.add(new Mobile(id, model, ram, price));
		}
		System.out.println("result sorted according to the id:");
		Collections.sort(alMob);
		for(Mobile m: alMob) {
			System.out.println(m.toString());
		}
		s.close();
	}

}
