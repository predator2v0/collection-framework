package linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		creation of a LinkedHashSet of Integer type.
		LinkedHashSet<Integer> ilhs = new LinkedHashSet<>();
		ilhs.add(9);
		ilhs.add(8);
		ilhs.add(6);
		ilhs.add(7);
		ilhs.add(3);
		ilhs.add(4);
		ilhs.add(5);
		ilhs.add(9);
		System.out.println(ilhs);
		
//		the clear() method clears all the elements from the set and makes the set an empty set.
		ilhs.clear();
		System.out.println(ilhs);
		
		LinkedHashSet<String> slhs = new LinkedHashSet<>();
		slhs.add("Hello");
		slhs.add("world");
		slhs.add("woha");
		slhs.add("hi");
		slhs.add("carter");
		slhs.add("how");
		slhs.add("are");
		slhs.add("you");
		
		System.out.println(slhs);
		
//		the clone() method clones the object of the LinkedHashset class and returns a shallow copy of the object.
//		it returns an object of Object type.
		Object slhsClone = slhs.clone();
		System.out.println(slhsClone);
		
//		the contains() method returns true if the specified element is present in the set, otherwise it returns false.
		System.out.println(slhs.contains("hi"));
		
//		the isEmpty() method checks if the set is empty or not. 
//		it returns true if the set is empty or else it returns false.
		System.out.println(ilhs.isEmpty());
		System.out.println(slhs.isEmpty());
		
//		the iterator() method returns an iterator over the set.
//		it is used to traverse through the set
		Iterator<String> sit = slhs.iterator();
		for(;sit.hasNext();) {
			System.out.println(sit.next());
		}
		
//		the remove() method removes the specified object from the set and returns true only if it is present in the set.
//		otherwise it returns false.
		System.out.println(slhs.remove("woha"));
		
//		the size() method returns the current size of the set. i.e. the total number of elements present in the set.
		System.out.println(slhs.size());
		
		
		Spliterator<String> splhs = slhs.spliterator();
		splhs.forEachRemaining(n -> System.out.println(n));
	}

}
