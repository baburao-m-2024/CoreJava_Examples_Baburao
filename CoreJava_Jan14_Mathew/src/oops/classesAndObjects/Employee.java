package oops.classesAndObjects;

// req : store data of all employees of same gender and same organization
public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private static char gender;
	private static String organization;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static char getGender() {
		return gender;
	}
	public static void setGender(char gender) {
		Employee.gender = gender;
	}
	public static String getOrganization() {
		return organization;
	}
	public static void setOrganization(String organization) {
		Employee.organization = organization;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
