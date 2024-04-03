package oops.polymorphism;

public class Developer extends Employee {
	
	private int noOfIssuesAssigned;
	private int noOfIssuesResolved;
	
	@Override
	double getBonus() {
		double bonus = (getSalary() * 20)/100;
		return bonus;
	}
	
	public Developer() {
		super();
	}
	public Developer(int id, String name, int salary, int noOfIssuesAssigned, int noOfIssuesResolved) {
		super(id, name, salary);
		this.noOfIssuesAssigned = noOfIssuesAssigned;
		this.noOfIssuesResolved = noOfIssuesResolved;
	}
	public int getNoOfIssuesAssigned() {
		return noOfIssuesAssigned;
	}
	public void setNoOfIssuesAssigned(int noOfIssuesAssigned) {
		this.noOfIssuesAssigned = noOfIssuesAssigned;
	}
	public int getNoOfIssuesResolved() {
		return noOfIssuesResolved;
	}
	public void setNoOfIssuesResolved(int noOfIssuesResolved) {
		this.noOfIssuesResolved = noOfIssuesResolved;
	}
	@Override
	public String toString() {
		return "Developer ["+super.toString()+", noOfIssuesAssigned=" + noOfIssuesAssigned + ", noOfIssuesResolved=" + noOfIssuesResolved
				+ "]";
	}

	
	
}

