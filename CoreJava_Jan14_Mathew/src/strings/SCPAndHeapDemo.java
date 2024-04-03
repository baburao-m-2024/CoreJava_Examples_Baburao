package strings;

public class SCPAndHeapDemo {

	public static void main(String[] args) {

		String name1 = "virat";  // SCP
		String name2 = "virat";  // SCP
		String name3 = "pant";  // SCP
		
		String name4 = new String("rohit");  // Heap
		String name5 = new String("rohit");  // Heap
		String name6 = new String("sharma");  // Heap
		
		System.out.println("CONTENT COMPARISION");
		System.out.println(name1.equals(name2));
		System.out.println(name2.equals(name3));
		System.out.println(name1.equals(name3)); 
		
		System.out.println(name4.equals(name5));
		System.out.println(name5.equals(name6));
		System.out.println(name4.equals(name6));
		System.out.println(name1.equals(name6));
		
		System.out.println();
		
		System.out.println("REFERENCE COMPARISION");
		System.out.println(name1 == name2);
		System.out.println(name2 == name3);
		System.out.println(name1 == name3);
		
		System.out.println(name4 == name5);
		System.out.println(name5 == name6);
		System.out.println(name4 == name6);
				
		boolean result1 = name1.equals(name2);
		if(result1 == true) {
			
		}else {
			
		}
		
	}

}

