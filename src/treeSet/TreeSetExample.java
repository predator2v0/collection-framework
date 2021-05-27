package treeSet;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		creation of a treeSet of String Type
		TreeSet<String> sts = new TreeSet<String>();
//		add() method adds an element to the tree set. 
//		the tree set is sorted and automatically places the given at the desired place
		sts.add("hay");
		sts.add("cay");
		sts.add("bye");
		sts.add("nay");
		sts.add("aay");
		sts.add("kay");
		sts.add("jay");
		sts.add("nay");
		System.out.println("sts<String>: "+sts);
		
//		creation of a treeSet of byte type
		TreeSet<Byte> bts = new TreeSet<>();
//		add() method adds an element to the tree set. 
//		the tree set is sorted and automatically places the given at the desired place
		bts.add((byte) 5);
		bts.add((byte) 6);
		bts.add((byte) 7);
		bts.add((byte) 9);  
		bts.add((byte) 8);
		bts.add((byte) 0);
		
//		creation of a treeSet of Long type
		TreeSet<Long> lts = new TreeSet<>();
//		add() method adds an element to the tree set. 
//		the tree set is sorted and automatically places the given at the desired place
		lts.add((long) 16);
		lts.add((long) 17);
		lts.add((long) 89);
		lts.add((long) 98);
		lts.add((long) 40);
		
//		creation of a treeSet of Number type
		TreeSet<Number> nts = new TreeSet<>();
//		addAll() method adds an entire collection to the tree set
		nts.addAll(bts);
		
		System.out.println("nts<Number>: "+nts);
//		the ceiling() method returns the equal or closest greatest element of the specified element
//		it returns null if no such element is present in the set
		System.out.println("ceiling(E e): "+bts.ceiling((byte) 1));
//		the floor() method returns the equal or closest smallest(least) element of the specified element
//		it returns null if no such element is present in the set
		System.out.println("floor(E e): "+bts.floor((byte) 1));
		
//		the descendingIterator() returns a an iterator of descending order.
//		by using it the treeSet can be iterated in reverse order.
		System.out.print("o/p of descendingIterator(): ");
		Iterator<String> dit = sts.descendingIterator();
		while(dit.hasNext()) {
			System.out.print(dit.next()+" ");
		}
		System.out.println();
		
//		the descendingSet() returns a set with the elements in reverse order.
		System.out.println("descendingSet(): "+lts.descendingSet());
		
//		the headSet() method returns the group of elements that are less than the specified element.
		System.out.println("headSet(E toObject): "+sts.headSet(("hay")));
		
//		the headSet() method returns the group of elements less than or equals to the specified element depending upon the inclusive value.
//		if the inclusive value is true, it will include the specified element, otherwise it will exclude the specified element.
		System.out.println("headSet(E toObject, boolean inclusinve): "+bts.headSet((byte)7,true));
		
//		the iterator() method returns an iterator over the treeSet.
//		it can be used to traverse the treeSet
		System.out.print("o/p of iterator(): ");
		Iterator<Byte> it = bts.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
//		the higher() method returns the equal or closest greatest element of the specified element
//		it returns null if no such element is present in the set
		System.out.println("higher(E e): "+lts.higher(40l));
//		the lower() method returns the equal or closest smallest(least) element of the specified element
//		it returns null if no such element is present in the set
		System.out.println("lower(E e): "+lts.lower(40l));
		
		System.out.println(lts);
//		the pollFirst() method retrieves(returns) and removes the first element of the set.
		System.out.println("pollFirst(): "+lts.pollFirst());
//		the pollLast() method retrieves(returns) and removes the last element of the set.
		System.out.println("pollLast(): "+lts.pollLast());
		System.out.println(lts);
		
//		spliterator() returns a Spliterator over the set
		System.out.print("O/P of spliterator(): ");
		Spliterator<String> spts = sts.spliterator();
		spts.forEachRemaining(n -> System.out.print(n+" "));
		System.out.println();
/*		the subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) returns a set of elements between a given range.
 *		the range is from "fromElement" to "toElement" -- passed as parameter 
 *		the parameters boolean fromInclusive and boolean toInclusive are used to set whether to include the fromElement and toElement in 
 *		the result set. i.e.
 *		both true -> includes both fromElement and toElement
 *		both false -> excludes both fromElement and toElement
 *		only toInclusive true -> includes only toElement
 *		only fromInclusive true -> includes only fromElement
 */
		System.out.println("subSet(E fEl, bool fIncl, E tEl, bool tIncl): "+sts.subSet("aay", true, "jay", true));
		
//		the subSet(E toElement, E fromElement) returns a set of elements between the given range i.e. between fromElement & toElement.
//		it automatically includes the fromElement and excludes the toElement
		System.out.println("subSet(E toElement, E fromElement): "+sts.subSet("aay", "jay"));
		
//		the tailSet() method returns a set of elements that are greater than the specified element.
		System.out.println("tailSet(E fromElement): "+bts.tailSet((byte)6));
		
//		the tailSet() method returns the group of elements greater than or equals to the specified element depending upon the inclusive value.
//		if the inclusive value is true, it will include the specified element, otherwise it will exclude the specified element.
		System.out.println("tailSet(E fromElement, boolean inclusive): "+bts.tailSet((byte)6, false));
		
//		the contains() method returns true if the specified element is present in the set, otherwise it returns false.
		System.out.println("contains(Object o): "+lts.contains((long)40));
		
//		the isEmpty() method returns true if the set is empty(no elements in the set). otherwise it returns false.
		System.out.println("isEmpty(): "+bts.isEmpty());
		
//		the remove() method removes and returns true if the specified element is present in the set. otherwise it returns false.
		System.out.println("remove(Object o): "+bts.remove((byte)5));
		System.out.println(bts);
		
//		the clear() method clears the set, i.e. removes all elements from the set making it an empty set.
		lts.clear();
		System.out.println(lts);
		
//		the clone() method returns a shallow copy of the set object. i.e a duplicate object of the treeSet object.
		Object obts = bts.clone();
		System.out.println("clone(): "+obts);
		
//		the first() method returns the first(smallest) element of the set.
		System.out.println("first(): "+sts.first());
		
//		the last() method returns the last(largest) element of the set.
		System.out.println("last(): "+sts.last());
		
//		the size() method returns the current size of the set, i.e. number of elements present currently in the set. 
		System.out.println("size(): "+sts.size());
	}
}
