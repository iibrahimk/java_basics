package basics;

public class SingleDiemnsionArray {
	
	public static void main(String[] args) {
		
		//without declaring the size
		int[] marks = new int[] {10,20,30,40,50};
		
		int marks2[] = {1,2,3,4,55};
		for(int i = 0; i<marks2.length; i++) {
			System.out.println(marks2[i]);
		}
		for(int i = 0; i<marks.length; i++) {
			System.out.println("Without size declearing: "+ marks[i]);
		}
		
		System.out.println("**********************************");
		
		//with declaring size
		int[] newMarks = new int[5];
		newMarks[0] = 20;
		newMarks[1] = 40;
		newMarks[2] = 50;
		newMarks[3] = 50;
		newMarks[4] = 90;
		
		for(int value : newMarks) {
			System.out.println("With size declearing: "+ value);
		}
		
		
		
	}

}
