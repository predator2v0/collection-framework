package accessingCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class CollectionAccessing {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		c.add(5);
		c.add(45);
		c.add(345);
		c.add(2345);
		c.add(12345);
		// Iterator can traverse any collection
		// declaring a Iterator object using iterator() method of ArrayList class to
		// access ArrayList Elements using it.
		Iterator<Integer> it = c.iterator();
		while (it.hasNext()) {
//            System.out.println(it.next());
			int val = (int) it.next();
			if (val == 5) {
				it.remove();
			} else {
				System.out.println(val);
			}
		}
		Queue<String> q = new PriorityQueue<>();
		q.add("hello");
		q.add("world");
		q.add("!");
		q.add(":)");
		// iterator of PriorityQueue class.
		Iterator<String> itr = q.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// ListIterator can traverse only those collections which implements the list
		// interface.
		ArrayList<Float> f = new ArrayList<>();
		f.add(12.5f);
		f.add(23f);
		f.add(324.5f);
		f.add(-3.43f);
		f.add(-0.98f);

		// ListIterator object to iterate through the Arraylist
		ListIterator<Float> li = f.listIterator();
		li.add(63.2f);
		while (li.hasNext()) {
			float fl = (float) li.next();
			if (fl == 23f) {
				li.remove();
			} else {
				System.out.println(li.nextIndex() + " " + fl);
			}
		}
		li.set(69f);
		while (li.hasPrevious()) {
			float gfl = (float) li.previous();
			if (gfl == 324.5f) {
				li.remove();
			} else {
				System.out.println(li.previousIndex() + " " + gfl);
			}
		}
		// for each loop to traverse/iterate through a set.
		Set<Double> st = new HashSet<>();
		st.add(45.0);
		st.add(395.6);
		st.add(246.8);
		st.add(10.5);
		st.add(45.0);
		st.add(246.8);

		for (Double hs : st) {
			System.out.println(hs);
		}
		// simple for loop to traverse through a list based collection.
		LinkedList<Short> ll = new LinkedList<>();
		ll.add((short) 1);
		ll.add((short) 2);
		ll.add((short) 3);
		ll.add((short) 4);
		ll.add((short) 5);
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i) + " ");
		}
		System.out.println(ll); // printing the collection will print all the values in a pair of square brackets [];
	}
}
