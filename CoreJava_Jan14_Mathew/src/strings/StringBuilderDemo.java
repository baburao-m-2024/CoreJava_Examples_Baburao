package strings;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("java");
		sb.delete(0, sb.length());
		
		sb.append("html");
		sb.delete(0, sb.length());
		
		sb.append("spring");
		
	}

}
