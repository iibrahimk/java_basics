package basics;

public class LogicalOperator {
	
	public static void main(String[] args) {
		
		boolean isOnline = true;
		boolean isActive = false;
		
		System.out.println("&& : " + (isOnline && isActive));
		System.out.println("|| : " + (isOnline || isActive));
		System.out.println("!  : " + (!isOnline == isActive));
	}

}
