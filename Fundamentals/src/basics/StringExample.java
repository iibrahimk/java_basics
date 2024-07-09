package basics;

public class StringExample {
	
	public static void main(String[] args) {
		
		//without the object and keyword
		String name = "Ibrahim Munna";
		System.out.println(name);
		
		//with the object keyword
		String newName = new String("Don Rozario");
		System.out.println(newName);
		
		//concat example
		
		String firstString = "Hell0 ";
		String secondString = "World!";
		
		String concatedString = firstString + secondString;
		String secondExample = firstString.concat(secondString);
		
		System.out.println("+ : "+ concatedString);
		System.out.println("Concat : "+secondExample );
		
		//getting the length
		System.out.println("length : "+ concatedString.length());
		
		//comparision
		System.out.println("Comparision : "+ concatedString.compareTo(secondString));
		
		//replace
		System.out.println("Replace : "+ concatedString.replace("0", "o"));
		
		//contains
		System.out.println("Contains H :"+concatedString.contains("H"));
		
		//triming
		System.out.println("Trimmig : "+concatedString.trim());
		
		//getting the index
		System.out.println("Index of H : "+concatedString.indexOf("H"));
		
		//get char index
		System.out.println("In index 7 : "+concatedString.charAt(7));
		
		//Uppercase
		System.out.println("Making uppercase : "+concatedString.toUpperCase());
		
		//lowercase
		System.out.println("Making lowercase : "+concatedString.toLowerCase());
		
		
		
				
				
	}

}
