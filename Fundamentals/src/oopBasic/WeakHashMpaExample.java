package oopBasic;

import java.util.WeakHashMap;

public class WeakHashMpaExample {
	
	public static void main(String[] args) {
		
		WeakHashMap<String, Integer> numbers = new WeakHashMap<String, Integer>();
		
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		
		System.out.println(numbers);
		
		String four = new String("Four");
		Integer fourValue = 4;
		
		numbers.put(four, fourValue);
		System.out.println(numbers);
		
		
		four = null;
		System.out.println(numbers);
		
		System.gc();
		System.out.println(numbers);
		
	}

}
