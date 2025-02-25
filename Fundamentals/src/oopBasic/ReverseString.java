package oopBasic;

import java.util.Stack;

class StrignRevers{
	public String resvers(String input) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char ch: input.toCharArray()) {
			stack.push(ch);
		}
		
		String reversed = "";
		
		while (!stack.empty()) {
			
			reversed += stack.pop();
		}
		
		return reversed;
	}
}

public class ReverseString extends StrignRevers{

	public static void main(String[] args) {

		StrignRevers strignRevers= new StrignRevers();
		
		String StraightString = "Ibrahim";
		
		String reversedString = strignRevers.resvers(StraightString);
		
		System.out.println(StraightString);
		System.out.println(reversedString);
		
	}
}
