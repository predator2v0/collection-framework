package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		comparators for sorting declared using  anonymous class.
		Comparator<Mobile> priceComp = new Comparator<Mobile>() {
			@Override
			public int compare(Mobile m1, Mobile m2) {
				if (m1.getPrice() == m2.getPrice()) {
					return 0;
				} else if (m1.getPrice() > m2.getPrice()) {
					return 1;
				} else {
					return -1;
				}
			}
		};
		Comparator<Mobile> modelComp = new Comparator<Mobile>() {
			@Override
			public int compare(Mobile m1, Mobile m2) {
				if (m1.getModel().compareTo(m2.getModel()) > 0) {
					return 1;
				} else if (m1.getModel().compareTo(m2.getModel()) < 0) {
					return -1;
				} else {
					return 0;
				}
			}
		};
		Comparator<Mobile> ramComp = new Comparator<Mobile>() {

			@Override
			public int compare(Mobile m1, Mobile m2) {
				// TODO Auto-generated method stub
				if (m1.getRam() > m2.getRam()) {
					return 1;
				} else if (m1.getRam() < m2.getRam()) {
					return -1;
				} else {
					return 0;
				}
			}
		};
		
//		input the elements to sort.
		Scanner s = new Scanner(System.in);
		int id, ram;
		String model;
		Float price;
		ArrayList<Mobile> alMob = new ArrayList<>();
		System.out.println("enter number of items:");
		int quantity = s.nextInt();
		for (int i = 0; i < quantity; i++) {
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
		
//		display after sorting according to various aspects.
		System.out.println("result sorted according to the id:");
		Collections.sort(alMob, new IdComparator());
		for (Mobile m : alMob) {
			System.out.println(m.toString());
		}

		System.out.println("result sorted according to the model:");
		Collections.sort(alMob, modelComp);
		for (Mobile m : alMob) {
			System.out.println(m.toString());
		}
		
		System.out.println("result sorted according to the ram:");
		Collections.sort(alMob, ramComp);
		for (Mobile m : alMob) {
			System.out.println(m.toString());
		}
		
		System.out.println("result sorted according to the price:");
		Collections.sort(alMob, priceComp);
		for (Mobile m : alMob) {
			System.out.println(m.toString());
		}
		
		s.close();
	}

}
