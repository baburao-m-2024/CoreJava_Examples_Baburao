package multiThreading;

public class GarbageCollectionDemo {

	public static void main(String[] args) {

		Teacher tObj = new Teacher(101, "harsha", "java");
		
		tObj = new Teacher(102, "babu", "angular");
		
		tObj = new Teacher(105, "hasini", "jQuery");
		
		tObj = new Teacher(109, "vyshnavi", "spring");
		
		System.out.println(tObj);
		
		System.gc();
		
		int c = 90;
		c= 80;
		c= 70;
		System.out.println(c);
		
	}

}
