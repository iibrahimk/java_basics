package oopBasic;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>();
		set.add("Bangladesh");
		set.add("Canada");
		set.add("Germany");
		set.add("Canada");
		
		System.out.println(set);
		System.out.println(set.contains("Bangladesh"));
	}

}
