package oops.classesAndObjects;

public class ObjectsDemo {

	public static void main(String[] args) {

		Student st = new Student();
		
		st.setRollNo(201);
		st.setName("yoshi");
		st.setGender('F');
		st.setCourse("html");
		/*
		System.out.println(st.getRollNo());
		System.out.println(st.getName());
		System.out.println(st.getGender());
		System.out.println(st.getCourse());*/
		
		System.out.println(st);
		
		//st = new Student();
		
		System.out.println();
		
		Student st2 = new Student();
		
		st2.setRollNo(201);
		st2.setName("yoshi");
		st2.setGender('F');
		st2.setCourse("html");
		
		System.out.println(st2);
		
	}

}
