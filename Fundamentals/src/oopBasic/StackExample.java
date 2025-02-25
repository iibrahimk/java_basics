package oopBasic;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.size());
		
		stack.push(20);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack);
		System.out.println(stack.size());
		
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.size());
		
		System.out.println(stack.peek());
		System.out.println(stack.size());

	}

}
