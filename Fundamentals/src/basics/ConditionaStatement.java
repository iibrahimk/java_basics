package basics;

import java.util.*;

public class ConditionaStatement {
	
	public static void main(String[] args) {
		
		//if else condition
		int oneNumber = 1;
		int twoNumber = 2;
		
		if(oneNumber>twoNumber) 
			System.out.println("IF");
		else if(oneNumber>twoNumber)
			System.out.println("Else if");
		else
			System.out.println("Else");
		
		//with logical operator
		
		boolean isAuthenticated = true;
		boolean isActive = false;
		
		if(isAuthenticated && isActive)
			System.out.println("Authenticated and Active");
		
		if(isAuthenticated || isActive)
			System.out.println("Authenticated or Active");
		
		//switch case
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type a char(A/B/C): ");
		String currentChar = scanner.nextLine();
		
		switch(currentChar) {
		case "A":
			System.out.println("Lucky!");
			break;
		case "B":
			System.out.println("Middle!");
			break;
		case "C":
			System.out.println("Unlucky!");
			break;
		default:
			System.out.println("Wrong!");
		}
		
		scanner.close(); 
		
		
		
		
		
		
	}

}
