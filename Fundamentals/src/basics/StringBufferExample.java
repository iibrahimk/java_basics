package basics;

public class StringBufferExample {

	public static void main(String[] args) {
		
		//String Buffer
		StringBuffer buffer = new StringBuffer("Hello ");
		System.out.println("Capacity : "+ buffer.capacity());
		buffer.append("World");
		System.out.println("Buffer : "+buffer);
		
		
		
		//String builder
		StringBuilder builder = new StringBuilder("Hello ");
		System.out.println("Capacity : "+ builder.capacity());
		builder.append("World");
		System.out.println("Builder : "+builder);
		
	}
}
