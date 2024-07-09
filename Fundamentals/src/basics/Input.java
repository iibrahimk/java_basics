package basics;

import java.util.Scanner;

public class Input {
	
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Your name is : "+name);
		System.out.println("Enter your age: ");
		String age = scanner.nextLine();
		System.out.println("Your age is: "+age);
		System.out.println("Enter your gender(M/F):");
		char gender = scanner.nextLine().charAt(0);
		System.out.println("Your gender is:" + gender);
		
		scanner.close(); 
		
	}

}
