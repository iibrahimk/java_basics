package oopBasic;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetExample {

	enum Size{
		SMALL, MEDIUM, LARGE, EXTRALARGE
	}
	
	public static void main(String[] args) {
	
		EnumSet<Size> sizes = EnumSet.allOf(Size.class);
		System.out.println(sizes);
		
		EnumSet<Size> sizes1 = EnumSet.noneOf(Size.class);
		System.out.println(sizes1);
		
		EnumSet<Size> sizes2 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
		System.out.println(sizes2);
		
		EnumSet<Size> sizes3 = EnumSet.of(Size.MEDIUM, Size.EXTRALARGE);
		System.out.println(sizes3);
		
		Iterator<Size> iterate = sizes.iterator();
		while(iterate.hasNext())
			System.out.println(iterate.next());	
	}

}
