package oopBasic;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<Integer> arrayList =  new ArrayList<Integer>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		
		System.out.println("List array : "+arrayList);
		System.out.println("Size of the list : "+arrayList.size());
		
		System.out.println("Remove by index : "+arrayList.remove(0));
		
		System.out.println("Get Index : "+arrayList.indexOf(2));
		
		
		for(int value : arrayList) {
			System.out.println(value);	
		}
	}

}
