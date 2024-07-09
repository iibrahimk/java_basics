package oopBasic;

class Calculation{
	
	public static int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int addition(int num1, int num2, int num3) {
		return num1 + num2 + num2;
	}
	
	public static float addition(float num1, float num2) {
		return num1 + num2;
	}
}

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		Calculation calculation = new Calculation();
		
		int firstResult = calculation.addition(1, 1);
		int secondResult = calculation.addition(1,1,1);
		float floatResult = calculation.addition(10.2F, 10.5F);
		
		System.out.println("Frist result : "+ firstResult);
		System.out.println("Second result : "+ secondResult );
		System.out.println("Float result : "+ floatResult );
		
		
	}

}
