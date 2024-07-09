package basics;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		
		int marks[][] ={ 
				{1,2,3,4,5},
				{5,4,3,2,1},
				{6,7,8,9,10}};
	
	for(int i = 0;i<3;i++) {
		for(int j=0;j<5;j++) {
			System.out.print(marks[i][j] + "\t");
		}
		System.out.println();
	}
}
}
