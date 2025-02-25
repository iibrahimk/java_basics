package oopBasic;

import java.util.List;
import java.util.LinkedList;
public class LinkedListExample {
	
	public static void main(String[] args) {
		
		List<String> linkedList = new LinkedList<String>();
		
		System.out.println(linkedList.size());
		
		linkedList.add("JAVA");
		linkedList.add("PYTHON");
		linkedList.add("JavaScript");
		
		System.out.println(linkedList);
		System.out.println(linkedList.size());
		
		linkedList.add(2,"C++");
		System.out.println(linkedList);
		System.out.println(linkedList.size());
		
		linkedList.remove(2);
		System.out.println(linkedList);
		System.out.println(linkedList.size());
		
		linkedList.remove("PYTHON");
		System.out.println(linkedList);
		System.out.println(linkedList.size());
		
		
	}

}
