package java8;

import java.util.ArrayList;
import java.util.List;

public class Stream_count {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<Integer>();

		marks.add(90);
		marks.add(30);
		marks.add(90);
		marks.add(80);
		marks.add(50);
		marks.add(10);
		marks.add(99);
		
		 long noOfPassMarks = marks.stream().filter(x -> x > 70).count();
		 
		 System.out.println("no of values filtered on condition are "+noOfPassMarks);
		
	}

}
