package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream_GroupBy {

	public static void main(String[] args) {

		List<Object> listObj = new ArrayList<Object>();
		
		listObj.add(90);
		listObj.add(60);
		listObj.add(90);
		listObj.add(60);
		listObj.add(90);
		listObj.add("java");
		listObj.add("html");
		listObj.add("java");
		
		Map<Object, Long> result = listObj.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
				
		result.entrySet().stream().forEach(e -> System.out.println(e.getKey()+" -- "+e.getValue()));
	}

}
