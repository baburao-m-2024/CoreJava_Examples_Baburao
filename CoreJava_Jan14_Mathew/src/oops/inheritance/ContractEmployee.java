package oops.inheritance;

public class ContractEmployee extends Employee {

	private int hourlyPrice;
	private int duration;
	
	public ContractEmployee() {
		super();
	}
	public ContractEmployee(int id, String name, char gender, int hourlyPrice, int duration ) {
		super(id, name, gender);
		this.hourlyPrice = hourlyPrice;
		this.duration = duration;
	}
	public int getHourlyPrice() {
		return hourlyPrice;
	}
	public void setHourlyPrice(int hourlyPrice) {
		this.hourlyPrice = hourlyPrice;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "ContractEmployee ["+super.toString()+", hourlyPrice=" + hourlyPrice + ", duration=" + duration + "]";
	}
	
	
	
}
