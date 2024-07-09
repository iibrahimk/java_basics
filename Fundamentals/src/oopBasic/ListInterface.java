package oopBasic;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class ListInterface {
	
	public static void main(String[] args) {
		
		List<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> vectors = new Vector<Integer>();
		
		System.out.print(linkedList.size());
		System.out.print(arrayList.size());
		System.out.print(vectors.size());
	}

}
