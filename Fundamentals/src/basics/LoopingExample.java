package basics;

public class LoopingExample {
	
	public static void main(String[] args) {
		
		int finish = 10;
		
		//for loop
		for(int i = 0;i < finish;i++) {
			System.out.println(i);
		}
		
		//for each
		int [] numbers = new int[] {1,2,3,4,5};
		
		for(int value : numbers) {
			System.out.println("Value : "+ value);
		}
		
		
		//while loop
		while(finish<=20) {
			System.out.println(finish);
			finish++;
		}
		
		System.out.println("*****************");
		
		do{
			System.out.println("DO");
		}
		while(finish <=20 );
		
		
	}

}
