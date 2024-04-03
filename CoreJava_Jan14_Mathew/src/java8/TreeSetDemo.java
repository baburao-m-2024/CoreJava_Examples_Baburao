package java8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Comparator<Integer> descCompObj = (num1, num2) -> {
			   return -(num1.compareTo(num2));
		};
				
				
		Set<Integer> setObj = new TreeSet<Integer>(descCompObj);
		
		setObj.add(90);
		setObj.add(40);
		setObj.add(90);
		setObj.add(20);
		setObj.add(30);
		setObj.add(80);
		
		Iterator<Integer> itrObj = setObj.iterator();
		
		while(itrObj.hasNext()) {
			System.out.println(itrObj.next());
		}
		
	}

}
