package oops.inheritance;

public class Employee {
	
	private int id;
	private String name;
	private char gender;
	
	public Employee() {
		super();		// this calls Object class default constructor method -- this stmt is optional
	}
	
	
	public Employee(int id, String name, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	

}
