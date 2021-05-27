package hashTable;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> htis = new Hashtable<Integer, String>();
//		the put() method puts a key-value entry in the Hash table.
		htis.put(1, "a");
		htis.put(0, "a");
		htis.put(3, "c");
		htis.put(2, "b");
		htis.put(4, "d");
//		using console print statement, the entire Hash table can be printed.
		System.out.println("hsis<Integer, String>: "+htis);
		
//		the get() method is used to retrieve a certain entry with the specified key.
//		it returns null if there is no such entry with certain key is found.
		System.out.println("hsis.get(3): "+htis.get(3));
//		the clone() method clones the hash table object and returns a Object which is a shallow copy of the hash table instance.
		System.out.println("hsis.clone(): "+htis.clone());
		
		htis.clear();
		System.out.println("after hsis.clear()-> \nhsis<Integer, String>: "+htis);
//		creation of a hash table using Hash table constructor.
		Hashtable<Integer, Integer>htii = new Hashtable<Integer, Integer>();
		htii.put(0, 001);
		htii.put(1, 100);
		htii.put(2, 200);
		htii.put(3, 300);
		htii.put(4, 400);
		htii.put(5, 500);
		System.out.println("htii<Integer, Integer>: "+htii);
//		the elements() method is used to create an Enumeration of the values of the HashTable.
		Enumeration<Integer> htEnumElementValues = htii.elements();
		System.out.print("Enumeration of Values: ");
		while (htEnumElementValues.hasMoreElements()) {
			System.out.print(htEnumElementValues.nextElement()+" ");
		}
		System.out.println();
		Enumeration<Integer> htEnumElementKeys = htii.keys();
		System.out.print("Enumeration of keys: ");
		while (htEnumElementKeys.hasMoreElements()) {
			System.out.print(htEnumElementKeys.nextElement()+" ");
		}
		System.out.println();
//		the equals() method checks for the equality of two instances / objects of the hashtable.
		System.out.println("htii.equals(htis): "+htii.equals(htis));
//		the hashCode() method returns the hash code value of the HashTable instance.
		System.out.println("htii.hashCode(): "+htii.hashCode());
		
		Enumeration<Integer> htEnumKeys = htii.keys();
		System.out.print("Enumeration of keys: ");
		while (htEnumKeys.hasMoreElements()) {
			System.out.print(htEnumKeys.nextElement()+" ");
		}
		System.out.println();
//		the keySet() method returns a set containing all the keys of the hash table.
		System.out.println("htii.keySet(): "+htii.keySet());
//		the remove() method removes the entry with the specified key and returns the value associated with it.
//		it returns null if no such key is found.
		System.out.println("htii.remove(0): "+htii.remove(0));
//		the replace() method replaces the value associated with the specified key with the new value provided
//		it returns the old value on successful replacement or null if replacement is unsuccessful.
		System.out.println("htii.replace(5, 550): "+htii.replace(5, 550));
//		the toString() returns the string representation of the hash table instance.
		System.out.println("htii.toString(): "+htii.toString());
//		the values() method returns a collection representation of all the values of the hash table.
		Collection<Integer> htCollection = htii.values();
		System.out.println(htCollection);
//		the contains() and containsValue() methods returns true if the specified value is present in the hash table, 
//		else they will return false.
		System.out.println("htii.contains(500): "+htii.contains(500));
		System.out.println("htii.containsValue(550): "+htii.containsValue(550));
//		the containsKey() method returns true if the specified key is present in the hash table, otherwise it returns false.
		System.out.println("htii.containsKey(0): "+htii.containsKey(0));
//		the isEmpty() method checks if the map is empty or not. it returns true if the hash table is empty, otherwise it returns false.
		System.out.println("htii.isEmpty(): "+htii.isEmpty());
//		the size() method returns the current size i.e. the number of elements present in the hash table currently.
		System.out.println("htii.size(): "+htii.size());
	}

}
