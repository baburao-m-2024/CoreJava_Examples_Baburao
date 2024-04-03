package oops.classesAndObjects;

public class ConstructorsDemo {

	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s);
		
		s.setRollNo(302);
		s.setName("lavanya");

		Student st = new Student(301, "mathew", 'M', "java");
		System.out.println(st);
		
		st.setRollNo(555);
		
		
		Student st2 = new Student(401, "babu", 'M', "angular");
		
		System.out.println(st2);
		
	}

}
