package arrayList;

import java.util.ArrayList;
import static java.util.Collections.sort;

public class ArrayListExample {

	public static void main(String[] args) {
//		creation of a new Byte array list and adding byte elements to it.
		ArrayList<Byte> bar = new ArrayList<>();
		bar.add((byte) 5);
		bar.add((byte) 6);
		bar.add((byte) 7);
		bar.add((byte) 9);
		bar.add((byte) 8);
		bar.add((byte) 0);

//		creating a new Long array list and adding long elements to it.
		ArrayList<Long> lar = new ArrayList<>();
		lar.add((long) 6);
		lar.add((long) 7);
		lar.add((long) 9);
		lar.add((long) 8);
		lar.add((long) 0);

//		creating a new array list of Number generic type and adding elements as well as collections to it.
		ArrayList<Number> ar = new ArrayList<>();

//		adding elements to ArrayList
		ar.add(45);
//		adding element at certain index in ArrayList
		ar.add(0, 66);
		ar.add(0, 46);
		ar.add(2, 76);
		ar.add(50);
//		adding collection to an ArrayList
		ar.addAll(bar);
//		adding collection at specified index in ArrayList
		ar.addAll(0, lar);

//		displaying the entire collection.
		System.out.println(ar);
		System.out.println(lar);
		lar.clear();
		System.out.println(lar);

//		creating ArrayList using parameterized constructor(passing the size of the ArrayList).
		ArrayList<String> sar = new ArrayList<>(4);
		sar.add("Hello ");
		sar.add("World");
		sar.add("!!");
		sar.add("!");
		sar.add(":");
//		setting the capacity of ArrayList using ensureCapacity(int minCapacity);
		sar.ensureCapacity(5);
		sar.add(")");
		sar.add("World");

		System.out.println(sar);
//		Retrieving the size of the ArrayList using size() method;
		System.out.println(sar.size());

//		getting the element from certain index in array list
		System.out.println(sar.get(2));
//		checking if the array list is empty
		System.out.println(sar.isEmpty());
		System.out.println(lar.isEmpty());
//		checking the last occurrence(index) of certain element in the Arraylist.
		System.out.println(sar.lastIndexOf("World"));
		System.out.println(sar.lastIndexOf("world"));
//		converting an ArrayList to array of Objects.
		Object[] ob = sar.toArray();
		for (Object o : ob) {
			System.out.print(o + " ");
		}
		Object[] obar = lar.toArray();
		for (int i = 0; i < obar.length; i++) {
			System.out.println(obar[i]); // won't display anything as no element is present in the ArrayList ar;
		}
		System.out.println(); // inserting line break
//		converting an array list to array of objects of certain type.
		Byte[] BArray = bar.toArray(new Byte[0]);
		for (Byte b : BArray) {
			System.out.println(b);
		}
//		returns an copy(clone) of the array list object. 
		Object clonedObj = sar.clone();
		System.out.println(clonedObj);
//		the returned object is of Object type. and can be explicitly typecasted to ArrayList type.
//		ArrayList<String> ClonedAL = (ArrayList<String>)sar.clone();
//		System.out.println(ClonedAL);

//		the contains() method will return true if the specified value is present in the ArrayList. Otherwise it returns false.
		System.out.println(sar.contains("Hello ")); // true
		System.out.println(sar.contains("java")); // false
//		the containsAll() method will return true if the specified collection is present in the ArrayList. Otherwise it returns false.
		System.out.println(ar.containsAll(bar)); // true
		System.out.println(ar.containsAll(sar)); // false

//		remove by specifying the index of the element
		System.out.println(ar);
		System.out.println(ar.remove(1));
		System.out.println(ar);
//		remove by specifying the object(element)
		Long lon = 9l;
		System.out.println(ar.remove(lon));
		System.out.println(ar);
//		remove entire collection using removeAll();
		System.out.println(ar.removeAll(lar));
		System.out.println(ar);
//		remove an element if it satisfies certain predicate using removeIf() method.
		System.out.println(sar.removeIf(n -> (n.equals("!")))); // (n -> (n.equals("!"))) represents the lambda
																// expression.
		System.out.println(sar);
//		remove a range of elements if the starting and ending index is given.
//		ar.removeRange(0,5);
//		this method is declared protected and only be used after inheriting the ArrayList class.

//		to replace all the elements of the ArrayList with certain value, the replaceAll() method is used.
		sar.replaceAll(n -> n.toUpperCase());
		System.out.println(sar);
//		trims the collection size to the number of element it holds.
		System.out.println(ar.size());
		ar.trimToSize();
		System.out.println(ar.size());

//		sort an collection using static sort() method from the Collections class.
		sort(sar);
		for (String s : sar) {
			System.out.println(s);
		}
//		using static import, no need to mention the class name for static members.
		sort(bar);
		for (byte b : bar) {
			System.out.println(b);
		}
	}

}
