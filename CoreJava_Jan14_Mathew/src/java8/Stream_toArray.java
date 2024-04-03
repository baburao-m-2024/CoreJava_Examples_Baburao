package java8;

import java.util.ArrayList;
import java.util.List;

public class Stream_toArray {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<Integer>();

		marks.add(90);
		marks.add(30);
		marks.add(90);
		marks.add(80);
		marks.add(50);
		marks.add(10);
		marks.add(99);
		
		Integer[] temp =  (Integer[]) marks.stream().toArray();
		
	}

}
