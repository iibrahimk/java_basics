package oopBasic;

class NewStudent{
	
	private int studentID;
	private String studentName;
	private int studentAge;
	
	//default constructions
	public NewStudent() {
		this.studentID = 101;
		this.studentName = "Ibrahim";
		this.studentAge = 29;
	}
	
	//Parameterized constructor
	
	public NewStudent (int sID, String sName, int sAge) {
		this.studentAge = sAge;
		this.studentID = sID;
		this.studentName = sName;
	}
	
	 void showDisplay(){
		System.out.println("StudentID : "+studentID);
		System.out.println("Student's name : "+studentName);
		System.out.println("Student's age : "+studentAge);
		
	}
}

public class objectCreation {
	
	public static void main(String[] args) {
		
		NewStudent student = new NewStudent();
		student.showDisplay();
		
		NewStudent studentNew = new NewStudent(2, "Munna", 24);
		studentNew.showDisplay();
	}

}
