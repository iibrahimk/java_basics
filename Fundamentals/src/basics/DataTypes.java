package basics;

import java.util.*;
import java.awt.Point;
public class DataTypes {
	public static void main (String[] args) {
		//primitive data types
		
		//byte size max 2
		byte age = 29;
		System.out.println(age);
		
		//long variable type
		long viewCount = 1_222_222_22;
		System.out.println(viewCount);
		
		//float data type
		float cgpa = 3.5F;
		System.out.println(cgpa);
		
		//char data type
		char letter = 'I';
		System.out.println(letter);
		
		//boolean data type
		boolean isActive = false;
		System.out.println(isActive);
		
		
		//Non-primtive data type
		
		//String
		String name = "Ibrahim";
		System.out.println(name);
		
		//Date
		Date now = new Date();
		System.out.println(now);
		
		//point 
		Point point1 =  new Point(10,20);
		System.out.println(point1.x + ":" +point1.y);
		
		
		
	}
}
