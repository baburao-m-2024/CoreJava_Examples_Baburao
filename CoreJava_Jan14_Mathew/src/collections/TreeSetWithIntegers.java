package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithIntegers {

	public static void main(String[] args) {

		//Set<Integer> setObj = new TreeSet<Integer>();  // by default it follows sorting logic of Integer class -- ascending order
		DescendingOrderComparator desc = new DescendingOrderComparator();
		
		Set<Integer> setObj = new TreeSet<Integer>(desc);
		
		setObj.add(90);
		setObj.add(30);
		setObj.add(80);
		setObj.add(40);
		setObj.add(90);
		setObj.add(30);
		setObj.add(50);
		
		Iterator<Integer> itrObj = setObj.iterator();
		
		while(itrObj.hasNext()) {
			System.out.println(itrObj.next());
		}
		
	}

}
