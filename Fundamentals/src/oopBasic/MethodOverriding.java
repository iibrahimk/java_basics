package oopBasic;

class NwePerson{
	String name;
	int age;
	
	public NwePerson(String name, int age) {
		this.name = name;
		this.age  = age;
	}
	
	void print() {
		System.out.println("Employee's name : " + name);
		System.out.println("Employee's age  : "+ age);
	}
}

class Employee extends NwePerson{
	String designation;
	float salary;
	
	public Employee(String name, int age, String designation, float salary) {
		super(name, age);
		this.designation = designation;
		this.salary = salary;
	}
	
	void print() {
		super.print();
		System.out.println("Employee's desgination : "+ designation);
		System.out.println("Employee's Salary : "+ salary);
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Kamla", 29, "Developer", 3369F);
		
		employee.print();
	}

}
