package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		creation of an array list using array list constructor.
		ArrayList<Integer> ali = new ArrayList<Integer>();
//		the addAll(collection, element1,element2,...) method adds the specified elements into the specified collection.
		Collections.addAll(ali, 99,100,54,9,3,65,48,54,1,61,618,51);
		System.out.println(ali);
//		the binarySearch(collection, element) method returns the index of the specified element in the specified collection.
//		it returns a negative integer if the element is not present in the collection.
		System.out.println(Collections.binarySearch(ali, 100));
		
//		the copy(destination, source) copies the source to the destination collection.
		List<Integer> src = Arrays.asList(1,2,3);
		List<Integer> dest = Arrays.asList(4,5,6,7,8,9);
		Collections.copy(dest, src);
		System.out.println(dest);
//		the disjoint(collection1, collection2) method returns true if no element of collection1 is same as any element of collection2
//		otherwise it returns false.
		System.out.println(Collections.disjoint(src, dest));
//		the fill(collection, fillObj) method fills the specified collection with the fillObj value.
//		i.e. it replaces all the values of the collection with the new value provided.
		Collections.fill(src, 5);
		System.out.println(src);
//		the max(collection) method returns the maximum value from the specified collection.
		System.out.println(Collections.max(ali));
//		the min(collection) method returns the minimum value from the specified collection.
		System.out.println(Collections.min(ali));
//		the replaceAlll(collection, oldVal, newVal) method replaces all the occurrences of oldVal with the newVal in the specified collection.
		Collections.replaceAll(src, 5, null);
		System.out.println(src);
//		the reverse(collection) method reverses the order of elements of the specified collection.
		Collections.reverse(ali);
		System.out.println(ali);
//		the rotate(collection, distance) method is used to rotate the collection by the specified distance.
//		i.e. the list will start from (size-distance)th element and all other element will be appended after that.
		Collections.rotate(ali, 5);
		System.out.println(ali);
//		the shuffle(collection) method shuffles the elements of the specified collection randomly.
		Collections.shuffle(ali);
		System.out.println(ali);
//		the sort(collection) method sorts the elements of the specified collection.
		Collections.sort(ali);
		System.out.println(ali);
//		the swap(collection, i, j) method swaps the (i)th index with the (j)th index of the specified collection.
		Collections.swap(ali, 0, ali.size()-1);
		System.out.println(ali);
	}

}
