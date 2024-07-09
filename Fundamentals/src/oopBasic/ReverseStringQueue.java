package oopBasic;

import java.util.Queue;
import java.util.Stack;
import java.util.ArrayDeque;

class ReverseStrings {

    // This method now returns a single reversed string
    public String reverseString(Queue<String> input) {
        Stack<String> stack = new Stack<>();

        // Use Queue<String> for reversedString to keep it consistent and clear
        Queue<String> reversedString = new ArrayDeque<>();

        while (!input.isEmpty()) {
            stack.push(input.remove()); // Correct method to remove from a queue
        }
        while (!stack.isEmpty()) {
        	reversedString.add(stack.pop());
        }

        // Build the reversed string from the queue
        StringBuilder reversed = new StringBuilder();
        while (!reversedString.isEmpty()) {
            reversed.append(reversedString.remove());
        }

        return reversed.toString();
    }
}

public class ReverseStringQueue extends ReverseStrings {

    public static void main(String[] args) {
        ReverseStrings reverseString = new ReverseStrings();

        Queue<String> straight = new ArrayDeque<>();
        straight.add("I");
        straight.add("B");
        straight.add("R");
        straight.add("A");

        System.out.println(straight);
        // Correctly get the reversed string
        String reversed = reverseString.reverseString(straight);
        System.out.println(reversed); // Output should be "ARBI"
    }
}
