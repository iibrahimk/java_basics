package basics;

import java.util.Scanner;

public class FizzBuzzGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Open scanner resource
        
        while (true) { // Infinite loop to keep the game running
            System.out.print("Enter your Number: ");
            String input = scanner.nextLine(); // Read user input as a string

            try {
                int number = Integer.parseInt(input); // Try converting the input to an integer

                // Check for Fizz, Buzz, and FizzBuzz
                if (number % 3 == 0 && number % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (number % 3 == 0) {
                    System.out.println("Fizz");
                } else if (number % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println("Number " + number + " is not divisible by 3 or 5. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number."); // Handle non-numeric input
            }
        }

        // scanner.close(); // Note: In an infinite loop, this line is unreachable
    }
}
