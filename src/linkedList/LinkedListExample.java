package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		creation of a Byte type LinkedList.
		LinkedList<Byte> bll = new LinkedList<>();
//		add elements to the LinkedList using add() method.
		bll.add((byte) 5);
//		add element at the beginning of the LinkedList using addFirst() method.
		bll.addFirst((byte) 3);
//		add element at the end of the LinkedList using addLast() method. it is same as the add() method.
		bll.addLast((byte) 9);
		bll.add(3,(byte) 4);
		bll.add((byte) 0);
		System.out.println(bll);
		
		LinkedList<Short> sll = new LinkedList<Short>();
		sll.add((short) 11);
//		add elements at a certain index using add() method.
		sll.add(0,(short) 12);
		sll.add(2,(short) 13);
		sll.add(3,(short) 14);
		sll.add((short) 15);
		System.out.println(sll);
		
		LinkedList<Number> ill = new LinkedList<>();
		ill.add(5);
		ill.add(45);
		ill.add(345);
		ill.add(2345);
		ill.add(12345);
		System.out.println(ill);
//		adding an entire collection to the LinkedList using AddAll() method.
		ill.addAll(sll);
		System.out.println(ill);
//		adding an entire collection to the LinkedList at the specified position using addAll() method.
		ill.addAll(0, bll);
		System.out.println(ill);
		
//		the clear() method deletes(clears) all the elements from the linked list.
		sll.clear();
		System.out.println(sll);
		
		Object bllClone = bll.clone();
		System.out.println(bllClone);
		
//		the contains() method returns true if the specified object is present in the list, otherwise it returns false.
		Short sht = 12;
		System.out.println(sll.contains(sht));
//		the containsAll() method returns true if the specified collection is present in the list, otherwise it returns false.
//		this method belongs to the List interface
		System.out.println(ill.containsAll(sll));
		
//		the descendingIterator() method returns an iterator over the linked list which can be used to display elements from end to beginning.
//		i.e. it will work same as the previous() method of the list iterator.
//		it accesses elements from the reversed linked list.
		Iterator<Byte> it = bll.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
//		the element() method retrieves the first element of the list.
		System.out.println(ill.element());
		System.out.println(ill.get(2));
		System.out.println(ill.getFirst());
		System.out.println(ill.getLast());
		
//		the indexOf() and lastIndexOf() methods are used to retrieve the index of first and last occurrence of an element in the list.
//		these methods return -1 if the element is not present in the list.
		System.out.println(ill);
		System.out.println(ill.indexOf(45));
		System.out.println(ill.lastIndexOf(5));
		
//		the listIterator(int index) method returns a list iterator of the linkedlist starting from the specified index.
//		i.e. the listIterator will iterate from the specified index to the end of the list.
		ListIterator<Number> li = ill.listIterator(5);
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println();
		
//		the offer() method add an element at the end of the list. 
//		offerFirst() adds at beginning and offerLast() adds at the end of the list.
		System.out.println(sll.offer((short) 19));
		System.out.println(sll.offerFirst((short) 18));
		System.out.println(sll.offerLast((short) 17));
		System.out.println(sll);
		
//		the peek() method retrieves the first element of the list
//		peekFirst() method retrieves the first element(i.e. same as peek()) 
//		peekLast() method retrieves the last element in the list.
//		all of these methods returns null if the list is empty.
		System.out.println(bll.peek());
		System.out.println(bll.peekFirst());
		System.out.println(bll.peekLast());
		
//		the poll() method returns and removes the first element from the list.
//		the pollFirst() method returns and removes the first elements of the list(same as poll())
//		the pollLast() method returns and removes the last element from the list.
//		all of these methods returns null if the list is empty.
		System.out.println(bll.poll());
		System.out.println(bll.pollFirst());
		System.out.println(bll.pollLast());
		System.out.println(bll);
		
//		push an element at the head of a linked list behaving as stack.
		bll.push((byte) 6);
		System.out.println(bll);
//		pops an element from the head of a linked list behaving as stack.
		System.out.println(bll.pop());
		
//		remove() method retrieves and removes first element from the list.
		System.out.println(ill.remove());
//		remove(int index) retrieves and removes element from the specified index.
		System.out.println(ill.remove(5));
//		remove(Object o) returns true if the Object o found in the list and removed. else it returns false
		Short st = 45;
		System.out.println(sll.remove(st));
		
//		removeFirst() method removes the first element of the Linked List.
		System.out.println(ill.removeFirst());
		
//		the removeFirstOccurrenct(Object o) removes the first occurrence of the object o in the list.
		System.out.println(ill.removeFirstOccurrence(45));
		
//		removeLast() removes the last element of the list and returns the same.
		System.out.println(ill.removeLast());
		System.out.println(ill);
		
//		removeLastOccurrence(Object o) removes the last occurrence of the last occurrence of the element in the list.
//		returns true if successfully removed. else it returns false.
		Short shor = 17;
		System.out.println(sll.removeLastOccurrence(shor));
		System.out.println(sll);
		
//		the set(int index, E element) replaces the element present at the specified index with the element passed as argument.
//		also, it returns the element that was replaced. i.e. the element that was present in the particular index previously.
		System.out.println(ill.set(1,543));
		
//		the size method returns the current size of the list.
		System.out.println(ill.size());
		
	}

}
