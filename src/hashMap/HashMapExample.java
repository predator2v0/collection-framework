package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		creating a new HashMap using the HashMap() constructor
		HashMap<Integer, String> hmis = new HashMap<Integer, String>();
//		the put() method puts elements in (Key, Value) pair inside the HashMap.
//		HashMap allows duplicate values, but no duplicate keys are allowed as key is stored in a set in hashmap.
//		if we put values with same key for multiple number of times, it will show no error but the previous values associated with the
//		particular key are simply replaced by the new ones and the last inserted value will be stored as the value for the specified key.
		hmis.put(1, "hello");
		hmis.put(2, "world");
		hmis.put(3, "null");
		hmis.put(4, "bye");
		hmis.put(5, "world");

//		we can simply print the HashMap to the console.
		System.out.println("hmis<Integer,String>: " + hmis);
//		creation of another hashmap using the hashmap constructor.
		HashMap<Integer, String> hmis1 = new HashMap<Integer, String>();
//		the putAll() method puts an entire map into the given hashmap(only if they are type compatible).
		hmis1.putAll(hmis);
		System.out.println("hmis1<Integer,String>: " + hmis1);
//		the clear() method clears (removes) all values from the HashMap.
		hmis1.clear();
		System.out.println("hmis1 after clear(): " + hmis1);
//		the clone() method clones the HashMap and returns an Object holding all the element of the HashMap.
		Object hmisClone = hmis.clone();
		System.out.println("hmis.clone(): " + hmisClone);
//		the containsKey() method checks if the specified key is present in the HashMap or not. 
//		if present, it returns true, otherwise it returns false.
		boolean containskey = hmis.containsKey(null);
		System.out.println("hims.containsKey(null): " + containskey);
//		the containsValue() method checks if the specified value is present in the HashMap or not.
//		if present, it returns true, otherwise it returns false.
		System.out.println("hmis.containsValue(\"world\"): " + hmis.containsValue("world"));
//		the entrySet() method returns a set view of the element present in the Map.
		Set<Map.Entry<Integer, String>> hmisSet = hmis.entrySet();
		System.out.println("Set view of map using entrySet(): " + hmisSet);
//		the get() method retrieves the Value from the HashMap for the specified Key
//		returns null if the specified Key is not present in the Hash Map.
		System.out.println("hmis.get(2): " + hmis.get(2));
//		the getOrDefault() method Returns the value to which the specified key is mapped. 
//		it returns the defaultValue if this map contains no mapping for the key.
		System.out.println("hmis.getOrDefault(7, \"This key is not present in the HashMap\"): "
				+ hmis.getOrDefault(7, "This key is not present in the HashMap"));
//		the isEmpty() method checks whether the Map is empty or not.
//		returns true if the map is empty otherwise it returns false.
		System.out.println("hmis.isEmpty(): " + hmis.isEmpty());
//		the keySet() method returns a set consisting of all the keys of the specified HashMap.
		Set<Integer> hmisKeySet = hmis.keySet();
		System.out.println("hmis.keySet(): " + hmisKeySet);
//		the remove() method retrieves and removes the specified element whose key is passed as argument.
		System.out.println("hmis.remove(5): " + hmis.remove(5));
		System.out.println("hmis<Integer,String>: " +hmis);
//		the remove() method retrieves and removes the specified entry if the key maps to the specified value.
//		otherwise it doesn't remove anything.
		System.out.println("hmis.remove(3,null): "+hmis.remove(3, "null"));
		System.out.println("hmis<Integer,String>: " +hmis);
//		the replace() method replaces the Value at associated with the specified Key with the new Value passed as argument.
//		it returns the previous value mapped to the key which is replaced by a new value.
		System.out.println("hmis.replace(2, \"haya\"): "+hmis.replace(2, "haya"));
		System.out.println("hmis<Integer,String>: " +hmis);
//		the replace() method replaces the value associated with the specified key to the new value passed as argument only if
//		the old value is equal to the old value argument passed as the argument in the method.
		System.out.println("hmis.replace(2, \"haya\",\"world\"): "+hmis.replace(2, "haya","world"));
		System.out.println("hmis<Integer,String>: " +hmis);
//		the size() method returns the current size of the HashMap i.e., the number of elements present in the list currently.
		System.out.println("hmis.size(): "+hmis.size());
//		the values() method returns a collection view of the Values of the map.
//		no key is contained in the collection.
		System.out.println("hmis.values(): "+hmis.values());
//		the same thing can be achieved by using iterator too.
//		Collection<String> mpc = hmis.values();
//		Iterator<String> itm = mpc.iterator();
//		while(itm.hasNext()) {
//			System.out.println(itm.next());
//		}
	}

}
