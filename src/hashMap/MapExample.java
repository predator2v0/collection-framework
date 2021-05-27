package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hmp = new HashMap<>();
		System.out.println(hmp);
		hmp.put(1, "carter");
		hmp.put(2, "barter");
		hmp.put(3, "darter");
		hmp.put(4, "darter");
		hmp.put(null, "hello");
		hmp.put(null, "cello");
		
		System.out.println(hmp);
		
		System.out.println(hmp.containsKey(5));
		
		System.out.println(hmp.get(null));
		System.out.println(hmp.put(5, null));
		System.out.println(hmp);
		
		Set<Integer> ks = hmp.keySet();
		System.out.println(ks);
		
		Set<Map.Entry<Integer, String>> es = hmp.entrySet();
		System.out.println(es);
	}

}
