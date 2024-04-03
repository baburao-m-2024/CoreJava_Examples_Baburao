package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream_sorted {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<Integer>();
		
		marks.add(90);
		marks.add(30);
		marks.add(90);
		marks.add(80);
		marks.add(50);
		marks.add(10);
		marks.add(99);
		
		marks.stream().forEach(temp -> System.out.print(temp+"  "));
		
		Comparator<Integer> descComp = (num1, num2) -> {
			 return -(num1.compareTo(num2));
		};
		
		System.out.println();
		marks.stream().sorted(descComp).forEach(temp -> System.out.print(temp+"  "));
		
	}

}
