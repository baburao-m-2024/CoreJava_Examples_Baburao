package java8;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Stream_map {

	public static void main(String[] args) {

		Set<Integer> setObj = new TreeSet<Integer>();

		setObj.add(90);
		setObj.add(40);
		setObj.add(90);
		setObj.add(20);
		setObj.add(30);
		setObj.add(80);
		
		setObj.stream().forEach(temp -> System.out.print(temp+"  "));
		
		System.out.println();
		
		Set<Integer> setObj2 = setObj.stream().map(temp -> temp * 2).collect(Collectors.toSet());
		
		setObj2.stream().sorted().forEach(temp -> System.out.print(temp+"  "));

	}

}
