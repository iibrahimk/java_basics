package oopBasic;


import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<String, Integer>();
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);
		evenNumbers.put("Six", 6);
		evenNumbers.put("Eight", 8);
		evenNumbers.put("Ten", 10);
		
		System.out.println(evenNumbers);
		
		LinkedHashMap<String, Integer> numbers = new LinkedHashMap<String, Integer>(evenNumbers);
		numbers.put("Twelve", 12);
		System.out.println(numbers);
		
		//checking and adding
		
		numbers.putIfAbsent("Twelve", 12);
		numbers.putIfAbsent("Fourteen", 14);
		System.out.println(numbers);
		
		
	}

}
