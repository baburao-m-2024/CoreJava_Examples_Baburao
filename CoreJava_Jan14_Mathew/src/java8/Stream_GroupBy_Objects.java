package java8;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_GroupBy_Objects {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "harsha", 9000, "hyd");
		Employee e2 = new Employee(102, "harika", 8000, "hyd");
		Employee e3 = new Employee(105, "hasini", 7000, "hyd");
		Employee e4 = new Employee(106, "vishnu", 7500, "banglore");
		Employee e5 = new Employee(110, "vybhav", 8500, "banglore");
		
		Set<Employee> setObj = new HashSet<Employee>();
		
		setObj.add(e1);
		setObj.add(e2);
		setObj.add(e3);
		setObj.add(e4);
		setObj.add(e5);
		
		Map<String, Long> results = setObj.stream().collect(Collectors.groupingBy(Employee::getLocation, Collectors.counting()));
		
		results.entrySet().stream().forEach(e -> System.out.println(e.getKey()+" -- "+e.getValue()));
		
	}

}
