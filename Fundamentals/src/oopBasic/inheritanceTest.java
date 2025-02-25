package oopBasic;

class NewStudent2{
	
	protected int studentID;
	protected String studentName;
	protected int studentAge;
	
	//default constructions
	public NewStudent2() {
		this.studentID = 101;
		this.studentName = "Ibrahim";
		this.studentAge = 29;
	}
	
	//Parameterized constructor
	
	public NewStudent2 (int sID, String sName, int sAge) {
		this.studentAge = sAge;
		this.studentID = sID;
		this.studentName = sName;
	}
	
	 void showDisplay(){
		System.out.println("StudentID : "+studentID);
		System.out.println("Student's name : "+studentName);
		System.out.println("Student's age : "+studentAge);
		
	};
}

class Marks extends NewStudent2{
	
	protected float objectiveMarks = 10.5F;
	protected float subjectiveMarks = 80.5F;
	
	 void showDisplay(){
		super.showDisplay();
		System.out.println("Objective marks : "+objectiveMarks);
		System.out.println("Subjective marks : "+subjectiveMarks);
		
	}
	
}

class Sports extends Marks{
	protected float sportsMarks = 10.5F;
	 void showDisplay(){
		super.showDisplay();
		System.out.println("Sports marks : "+sportsMarks);
		
	}
}

class Result extends Sports{
	
	protected float totalScore = objectiveMarks + subjectiveMarks  + sportsMarks;
	
	void calculateResult() {
		super.showDisplay();
		System.out.println("Total marks : "+ totalScore);
	}
}


public class inheritanceTest {
	
	public static void main(String[] args) {
		
		Result result = new Result();
		
		result.calculateResult();		
	}
}
