package oopBasic;


class Person{
		private String firstName;
		private String lastName;
		
		public String getFirstName() {
			return this.firstName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getLastName() {
			return this.lastName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
}


public class encapsulation {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setFirstName("Ibrahim");
		String firstName = person.getFirstName();
		System.out.println(firstName);
		person.setLastName("Munna");
		String lastName = person.getLastName();
		System.out.println(lastName);
		
				
		
	}

}
