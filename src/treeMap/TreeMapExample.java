package treeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		create a tree map using the TreeMap constructor.
		TreeMap<Integer, String> tmis = new TreeMap<Integer, String>();
//		the put() method is used for placing elements in key-value pair into the tree map.
		tmis.put(1, "iron man");
		tmis.put(2, "captain america");
		tmis.put(3, "hulk");
		tmis.put(4, "thor");
		tmis.put(5, "loki");
//		the entire map can be printed using tree map object.
		System.out.println("tmis<Integer,String>: " + tmis);
//		the get() method retrieves the value for the specified key if the key is present in the map.
//		otherwise it returns false.
		System.out.println("tmis.get(3): " + tmis.get(3));

//		the clone() method creates a cloned object of the tree map object.
//		it returns a object of Object type which is a shallow copy of the original TreeMap object.
		Object tmisClone = tmis.clone();
		System.out.println(tmisClone.toString());
		System.out.println("tmis.clone(): " + tmisClone);
//		the clear() method removes all the element from the map.
		tmis.clear();
		System.out.println("after tmis.clear(): " + tmis);

//		creation of a tree map using tree map constructor.
		TreeMap<Integer, Integer> tmii = new TreeMap<Integer, Integer>();
		tmii.put(1, 100);
		tmii.put(4, 200);
		tmii.put(5, 300);
		tmii.put(2, 400);
		tmii.put(3, 500);
//		TreeMap stores the entries in sorted order.
//		sorts in ascending order by default as per the keys.
		System.out.println("tmii<Integer,Integer>: " + tmii);
//		the ceilingKey() method returns the least key greater than or equal to the specified key.
//		returns null if there is no such key present
		System.out.println("tmii.ceilingKey(0): " + tmii.ceilingKey(0));
//		the ceilingEntry() method returns the least key-value pair greater than the or equal to the specified key.
//		it returns null if there is no such element present.
		System.out.println("tmii.ceilingEntry(6): " + tmii.ceilingEntry(6));
//		the descendingKeySet() method returns a set of all the keys of the map in descending order.
		System.out.println("tmii.descendingKeySet(): " + tmii.descendingKeySet());
//		the descendingMap() method returns a map of all the entries in key-value pair in descending order.
		System.out.println("tmii.descendingMap(): " + tmii.descendingMap());
//		the firstEntry() method returns the first key-value entry of the TreeMap i.e. the entry with the smallest(least) key
		System.out.println("tmii.firstEntry(): " + tmii.firstEntry());
//		the floorEntry() method returns the highest entry of key-value pair whose key is less than or equal to the specified key.
		System.out.println("tmii.floorEntry(6): " + tmii.floorEntry(6));
//		the headMap() method returns entries in key-value pair whose keys are strictly less than the specified key.
		System.out.println("tmii.headMap(4): " + tmii.headMap(4));
//		the headMap() method with a inclusive parameter displays the key value pairs with keys less than and equals to the specified key
//		if the inclusive parameter is set to true.
		System.out.println("tmii.headMap(4,true): " + tmii.headMap(4, true));
//		the higherEntry() method returns the least key-value entry higher(greater) than the specified key. 
//		returns null if no such element is present.
		System.out.println("tmii.higherEntry(3): " + tmii.higherEntry(3));
//		the higherKey() method returns the least key greater than the specified key.
//		it returns null if there is no such key available in the Map.
		System.out.println("tmii.higherKey(5): " + tmii.higherKey(5));
//		the keySet() method returns a set containing all the keys of the TreeMap.
		Set<Integer> tmiiKeySet = tmii.keySet();
		System.out.println("tmii.keySet(): " + tmiiKeySet);
//		the lastEntry() method returns a key-value pair containing the last(largest key) element 
		System.out.println("tmii.lastEntry(): " + tmii.lastEntry());
//		the lowerEntry() method returns the highest key-value pair entry less than the specified key.
//		it returns null if no such element is available in the map.
		System.out.println("tmii.lowerEntry(1): " + tmii.lowerEntry(1));
//		the lowerKey() method returns the highest key less than the specified key.
//		returns null if no such element is found in the map
		System.out.println("tmii.lowerKey(2): " + tmii.lowerKey(2));
//		the navigableKeyset() method returns a navigable set of all keys of the Map.
		System.out.println("tmii.navigableKeySet(): " + tmii.navigableKeySet());
//		the pollFirstEntry() method retrieves and removes the first(least) element from the Map.
		System.out.println("tmii.pollFirstEntry(): " + tmii.pollFirstEntry());
		System.out.println("tmii<Integer, Integer>: " + tmii);
//		the pollLastEntry() method retrieves and removes the last(highest) element from the Map.
		System.out.println("tmii.pollLastEntry(): " + tmii.pollLastEntry());
		System.out.println("tmii<Integer, Integer>: " + tmii);

//		creation of an TreeMap using tree map constructor.
		TreeMap<Integer, Integer> tmii1 = new TreeMap<Integer, Integer>();
//		putAll() method puts all the entries from the specified Map into the calling Map.
		tmii1.putAll(tmii);
		System.out.println("tmii1<Integer, Integer>: " + tmii1);
//		the replace() method replaces the value of specified key with the specified value and returns the previous value which is removed.
//		it returns null if the specified key is not present.
		System.out.println("tmii.replace(2, 600): " + tmii.replace(2, 600));
		System.out.println("tmii<Integer, Integer>: " + tmii);
//		the replace() method replaces the value at specified key with the new value only if the old value matches the passed old value.
//		returns true on successful replacement, otherwise it returns false.
		System.out.println("tmii.replace(3,400,800): " + tmii.replace(3, 400, 800));
		System.out.println("tmii<Integer, Integer>: " + tmii);
//		the subMap() method returns key-value pairs whose keys range from fromKey to toKey.
//		fromKey is included and toKey is excluded
		System.out.println("tmii.subMap(2, 4): " + tmii.subMap(2, 4));
//		the subMap() method returns key-value pairs whose keys range from fromKey to toKey.
//		fromKey and toKey are included or excluded as per the inclusive parameters, i.e. true will include and false will exclude.
		System.out.println("tmii.subMap(2, false, 4, true): " + tmii.subMap(2, false, 4, true));
//		the tailMap() method returns the key-value pairs whose keys are greater than or equal to the specified key.
		System.out.println("tmii.tailMap(3): " + tmii.tailMap(3));
//		the tailMap() method returns the key- value pairs whose keys are greater than (or equals if the inclusive value is true) 
//		the specified key.
		System.out.println("tmii.tailMap(3, false): " + tmii.tailMap(3, false));
//		the containsKey() method returns true if the specified key is present in the map, otherwise it returns false.
		System.out.println("tmii.containsKey(6): " + tmii.containsKey(6));
//		the containsValue() method returns true if the specified Value is present in the map, otherwise it returns false.
		System.out.println("tmii.containsValue(200): " + tmii.containsValue(200));
//		the firstKey() method returns the first(lowest) key of the map
		System.out.println("tmii.firstKey(): " + tmii.firstKey());
//		the lastKey() method returns the last(highest) key of the map
		System.out.println("tmii.lastKey(): " + tmii.lastKey());
//		the remove() method retrieves and removes the entry with the specified key from the map.
//		it returns null if the specified key is not present in the map.
		System.out.println("tmii.remove(3): " + tmii.remove(3));
		System.out.println("tmii<Integer, Integer>: " + tmii);
//		the size() method returns the number of entries present in the map currently.
		System.out.println("tmii.size(): " + tmii.size());
//		the values() method returns the collection view of the map.
		System.out.println("tmii.values(): " + tmii.values());
	}

}
