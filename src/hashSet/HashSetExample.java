package hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		creation of a Hash set.
		HashSet<Integer> ihs = new HashSet<Integer>();
//		the add() method adds an element to the HashSet only if the element is not present and returns true.
		ihs.add(5);
//		duplicate elements cannot be added to hash set and the add() method returns false in this case.
		System.out.println(ihs.add(6));
		System.out.println(ihs.add(6));
		ihs.add(9);
		ihs.add(8);
		ihs.add(7);
		ihs.add(0);
		ihs.add(5);
		ihs.add(1);
//		NOTE: as HashSet doesn't maintain any order of the elements in the set, it keeps the set sorted if the elements are of integer type.
		System.out.println(ihs);
//		the clone() method clones the Hash Set object and returns a shallow copy of it.
//		this method returns an object of the Object Type.
		Object cloneHs = ihs.clone();
		System.out.println(cloneHs);
		
		HashSet<String> shs = new HashSet<String>();
		shs.add("papu");
		shs.add("papu");
		shs.add("subham");
		shs.add("subhakanta");
		shs.add("asd");
		shs.add("zkg");
		System.out.println(shs);
		
//		the clear() method clears all the elements from the set and makes the set an empty set.
		shs.clear();
		System.out.println(shs);
		
//		the contains() method returns true if the specified element is present in the set, otherwise it returns false.
		System.out.println(ihs.contains(0));
		System.out.println(ihs.contains(3));
		
//		the isEmpty() method returns true if the set is empty, otherwise it returns false.
		System.out.println(ihs.isEmpty());
		System.out.println(shs.isEmpty());
		
//		the iterator() method returns an iterator over the specified collection(set) with which it is called.
		Iterator<Integer> it = ihs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
//		the remove() method removes the specified object(element) from the set and returns true. 
//		if the element is not present in the set, it returns false.
		System.out.println(ihs.remove(7));
		System.out.println(ihs);
		
//		the size() method returns the current size of the set, i.e. the total number of elements present in the Set.
		System.out.println(ihs.size());
		
		
		Spliterator<Integer> spi = ihs.spliterator();
		spi.forEachRemaining(n -> System.out.println(n));
	}

}