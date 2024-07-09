package basics;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		boolean isAuthenticated = true;
		
		if(isAuthenticated)
			System.out.println("Autherticated");
		else
			System.out.println("Not autherticated");
		
		String result = isAuthenticated ? "Autherticated" : "Not autherticated";
		
		System.out.println(result);
	}
}
