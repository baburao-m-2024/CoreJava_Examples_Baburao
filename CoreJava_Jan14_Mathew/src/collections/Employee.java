package collections;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private int salary;
	
	

	public Employee(int id, String name, int salary) {
		super();  // this refers to Object class default constructor
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {

		Employee e1 = this;
		Employee e2 = o;
		
		String e1Name = e1.getName();
		String e2Name = e2.getName();
		
		int nameSortingResult = (e1Name.compareTo(e2Name));
		
		if(nameSortingResult != 0) {
			return nameSortingResult;
		}else {
			Integer e1Id = e1.getId();
			Integer e2Id = e2.getId();
			
			return e1Id.compareTo(e2Id);
		}
	}
	

}
