package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream_Limit {

	public static void main(String[] args) {
		
		Comparator<Integer> descComp = (num1, num2) -> {
			 return -(num1.compareTo(num2));
		};

		List<Integer> marks = new ArrayList<Integer>();

		marks.add(90);
		marks.add(30);
		marks.add(90);
		marks.add(80);
		marks.add(50);
		marks.add(10);
		marks.add(99);
		
		marks.stream().sorted(descComp).limit(4).forEach(t -> System.out.print(t+"  "));
		
	}

}
