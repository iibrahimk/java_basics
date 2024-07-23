package oopBasic;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
	
	public static void main(String[] args) {
		
		NavigableSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		System.out.print(set);
		
		NavigableSet<Integer> reversed = set.descendingSet();
		System.out.print(reversed);
		
	}

}
