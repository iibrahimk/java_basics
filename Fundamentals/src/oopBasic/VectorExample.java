package oopBasic;

import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		
		System.out.println(vector.size());
		
		vector.add("JAVA");
		vector.add("PYTHON");
		vector.add("JavaScript");
		
		System.out.println(vector);
		System.out.println(vector.size());
	}

}
