package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithObjects {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "harsha", 9000);
		Employee emp2 = new Employee(105, "vivek", 8000);
		Employee emp3 = new Employee(104, "karthik", 7500);
		Employee emp4 = new Employee(110, "harsha", 9500);

		
		Set<Employee> setObj = new TreeSet<Employee>();
		setObj.add(emp); 
		setObj.add(emp2);  // emp.compareTo(emp2)
		setObj.add(emp3);  // emp2.compareTo(emp3)
		setObj.add(emp4);
		
		Iterator<Employee> itrObj = setObj.iterator();
		
		while(itrObj.hasNext()) {
			System.out.println(itrObj.next());
		}
		
	}

}
