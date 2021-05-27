package priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		created a priority queue
//		the priority queue of the collection framework does not follow the FIFO mechanism.
		PriorityQueue<String> pqs = new PriorityQueue<>();
//		addition of elements in the priority queue using add() method.
		System.out.println("add(): "+pqs.add("hello"));
		pqs.add("hi");
		pqs.add("bye");
//		display the priority queue
		System.out.println("pqs<String>: "+pqs);
//		remove all elements from the queue using clear() method.
		pqs.clear();
		System.out.println("after pqs.clear(): "+pqs);
		
		PriorityQueue<Integer> pqi = new PriorityQueue<>();
		pqi.add(5);
		pqi.add(6);
		pqi.add(7);
		pqi.add(8);
		pqi.add(9);
		System.out.println("pqi<Integer>: "+pqi);
//		the contains() method checks whether the given element is present in the queue or not. 
//		returns true if the element found else returns false.
		System.out.println("pqi.contains(7): "+pqi.contains(7));
		
//		creating an iterator of integer type to traverse through the collection(priority queue).
		Iterator<Integer> it = pqi.iterator();
		System.out.print("o/p of iterator(): ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
//		offer() method adds an element to the queue and returns true on successful insertion.
		System.out.println("pqi.offer(10): "+pqi.offer(10));
		System.out.println("pqi<Integer>: "+pqi);
		
//		the peek()  method retrieves the HEAD element(first element) from the queue but does not remove it.
		System.out.println("pqi.peek(): "+pqi.peek());
		System.out.println("pqi<Integer>: "+pqi);
//		the poll() method retrieves and removes the HEAD element from the queue.
		System.out.println("pqi.poll(): "+pqi.poll());
		System.out.println("pqi<Integer>: "+pqi);
		
//		the remove() method removes the specified element from the queue if found and returns true.
//		otherwise it returns false.
		System.out.println("pqi.remove(8): "+pqi.remove(8));
		System.out.println("pqi<Integer>: "+pqi);
//		the size() method returns the current size i.e. the number of elements present in the queue.
		System.out.println("pqi.size(): "+pqi.size());
	}

}
