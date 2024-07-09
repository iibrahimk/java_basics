package basics;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		//Type casting
		
		int intNumber = 100;
		long longNumber =  intNumber;
		double doubleNumber  = intNumber;
		
		System.out.println(intNumber);
		System.out.println(longNumber);
		System.out.println(doubleNumber);
		
		double newDoubleValue = 100.59;
		int newIntValue = (int) newDoubleValue;
		
		System.out.println(newDoubleValue);
		System.out.println(newIntValue);
		
				
	}

}
