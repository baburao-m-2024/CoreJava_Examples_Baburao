package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_filter {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<Integer>();

		marks.add(90);
		marks.add(30);
		marks.add(90);
		marks.add(80);
		marks.add(50);
		marks.add(10);
		marks.add(99);
		
		List<Integer> passMarks = marks.stream().filter(x -> x > 60).collect(Collectors.toList());
		
		passMarks.stream().forEach(t -> System.out.print(t+"  "));

	}

}
