package basics;

public class ArithmaticOperators {
	
	public static void main(String[] args) {
		
		int firstValue = 50;
		int secondValue = 100;
		
		//normal operators
		System.out.println("Addition : " + (firstValue + secondValue));
		System.out.println("Substruction : " + (firstValue - secondValue));
		System.out.println("Multiplication : " + (firstValue * secondValue));
		System.out.println("Division : " +  (secondValue / firstValue));
		System.out.println("Modulas : " + (firstValue % secondValue));
		
		//incremental / Decremental operators
		
		System.out.println("Post Increment : "+ firstValue++);
		System.out.println("Pre Increment : "+ ++firstValue);
		System.out.println("pre Decrement : "+ firstValue--);
		System.out.println("Post Decrement : "+ --firstValue);
	}

}
