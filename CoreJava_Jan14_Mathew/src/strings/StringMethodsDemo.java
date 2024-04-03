package strings;

public class StringMethodsDemo {

	public static void main(String[] args) {

		String course1 = "java";
		               // 0123
		
		System.out.println(course1);
		System.out.println(course1.length()); // 4
		System.out.println(course1.charAt(0));  // j
		System.out.println(course1.indexOf('a'));  // 1
		System.out.println(course1.lastIndexOf('a'));  // 3
		System.out.println(course1.concat("script"));  // javascript
		
		System.out.println(course1.startsWith("j"));
		System.out.println(course1.endsWith("a"));
		
		System.out.println(course1.isEmpty());  // String x = ""; //empty  String y;  // y - null
		String y = "10";
		y = "";
		
		System.out.println(course1.substring(1));  // ava
		
		String fullName = "  virat  kohli  ";
		System.out.println(fullName);  //   virat  kohli   
		System.out.println(fullName.trim());  //virat  kohli
		
		System.out.println(fullName.replace(" ",  ""));
		
		System.out.println(String.join(" - ", "html", "css", "java", "typescript", "angular"));
		
	}

}
