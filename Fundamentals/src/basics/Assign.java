package basics;

public class Assign {
	
	public static void main(String[] args) {
		
		int firstNumber = 100;
		int secondNumber = 200;
		
		int result = firstNumber + secondNumber;
		
		System.out.println("= "+(result));
		
		//different assign
		
		result += firstNumber;
		System.out.println("+= "+result);
		
		result -= firstNumber;
		System.out.println("-= "+result);
		
		result *= firstNumber;
		System.out.println("*= "+result);
		
		result /= firstNumber;
		System.out.println("/= "+result);
		
		result %= firstNumber;
		System.out.println("%= "+result);
		
	}

}
