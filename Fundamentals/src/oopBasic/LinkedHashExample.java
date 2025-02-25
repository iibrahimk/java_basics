package oopBasic;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHashExample {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		evenNumbers.add(8);
		System.out.println(evenNumbers);
		
		LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>(evenNumbers);
		numbers.add(10);
		System.out.println(numbers);
		
		Iterator<Integer> iterate = numbers.iterator();
		while(iterate.hasNext())
			System.out.println(iterate.next());
		
		System.out.println(numbers.remove(2));
		System.out.println(numbers.removeAll(numbers));
	}

}
