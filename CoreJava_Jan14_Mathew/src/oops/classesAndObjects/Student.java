package oops.classesAndObjects;

public class Student {
	
	private int rollNo;
	private String name;
	private char gender;
	private String course;
	
	Student() {
		
	}
	
	Student(int rollNo, String name, char gender, String course) {
		 this.rollNo = rollNo;    // this keyword represents the object with which this method is getting called
		 this.name = name;
		 this.gender = gender;
		 this.course = course;
	}
	
	public static void main(String[] args) {
		
		// ClassName objectName = new ClassName()
		
		Student st = new Student();
				
		st.setRollNo(101);
		st.setName("harsha");
		st.setGender('M');
		st.setCourse("java");
		
		System.out.println(st.getRollNo());
		System.out.println(st.getName());
		System.out.println(st.getGender());
		System.out.println(st.getCourse());
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		
		return "Student [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + ", course=" + course + "]";
		
	}
	
	

}
