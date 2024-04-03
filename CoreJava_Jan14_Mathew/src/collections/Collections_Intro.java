package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections_Intro {

	public static void main(String[] args) {

		//int[] marks = new int[5];
		
		// java.util package  -- predefined classes
		
		// creating a collection object
		ArrayList<Object> listObj = new ArrayList<Object>();
		
		// storing the data in the collection object
		listObj.add(90);
		listObj.add(80);
		listObj.add("harsha");
		listObj.add("hasini");
		listObj.add(90);
		listObj.add('M');
		listObj.add(90.45);
		
		System.out.println(listObj.get(1));  // 80
		
		System.out.println(listObj.size());
		
		// getting data out of collection object
		Iterator<Object> itrObj = listObj.iterator();
		
		while(itrObj.hasNext()) {
			System.out.println(itrObj.next());
		}
		
	}

}
