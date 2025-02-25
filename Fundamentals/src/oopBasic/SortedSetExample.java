package oopBasic;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;

public class SortedSetExample {
	
	public static void main(String[] args) {
		
		SortedSet<String> set = new TreeSet<String>();
		set.add("Bangladesh");
		set.add("Australia");
		set.add("Germay");
		set.add("Australia");
		
		System.out.println(set);
		Iterator<String> iterate = set.iterator();
		while(iterate.hasNext())
			System.out.println(iterate.next());
		
		System.out.println(set.contains("Bangladesh"));
		System.out.println(set.first());	
		System.out.println(set.last());
		System.out.println(set.remove("Bangladesh"));
		System.out.println(set);
		System.out.println(set.removeAll(set));
		System.out.println(set);
	}

}
