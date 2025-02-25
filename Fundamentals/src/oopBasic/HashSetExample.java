package oopBasic;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(100);
		hashSet.add(200);
		hashSet.add(300);
		hashSet.add(400);
		
		Iterator<Integer> iterate = hashSet.iterator();
		
		while(iterate.hasNext())
			System.out.println(iterate.next());
		
		hashSet.remove(300);
		
		
		System.out.println(hashSet);
		
		HashSet<Integer> hashSet1 = new HashSet<Integer>();
		
		hashSet1.add(100);
		hashSet1.add(200);
		hashSet1.add(300);
		hashSet1.add(400);
		
		HashSet<Integer> hashSet2 = new HashSet<Integer>();
		
		hashSet2.add(100);
		hashSet2.add(200);
		hashSet2.add(300);
		hashSet2.add(500);
		
//		hashSet1.addAll(hashSet2);
//		System.out.println(hashSet1);
		
		hashSet1.retainAll(hashSet2);
		System.out.println(hashSet1);
		
		hashSet2.removeAll(hashSet1);
		System.out.println(hashSet2);
		
		
	}

}
