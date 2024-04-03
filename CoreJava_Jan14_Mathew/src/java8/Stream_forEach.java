package java8;

import java.util.Set;
import java.util.TreeSet;

public class Stream_forEach {

	public static void main(String[] args) {

		Set<Integer> setObj = new TreeSet<Integer>();

		setObj.add(90);
		setObj.add(40);
		setObj.add(90);
		setObj.add(20);
		setObj.add(30);
		setObj.add(80);
		
		setObj.stream().forEach(temp -> System.out.print(temp+" "));
		
		System.out.println();
		
		setObj.stream().forEach(temp -> System.out.print(temp * 2+"  "));

	}

}
