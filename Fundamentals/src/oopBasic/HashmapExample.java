package oopBasic;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(01,"IBRAHIM");
		map.put(02,"Sumaiya");
		map.put(03,"Suhayra");
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() +" : "+ m.getValue());
		}
		
		String value = map.get(02);
		System.out.println(value);
		
		//getting the keys
		System.out.println("Key Sets : "+map.keySet());
		System.out.println("Values : "+map.values());
		System.out.println("Entry Sets : "+map.entrySet());
		System.out.println("Remove by key : "+map.remove(01));
		System.out.println("New entry Sets : "+map.entrySet());
		
		//clearing the map
		map.clear();
		
		System.out.println("After remove : "+map);
		
		
	}

}
