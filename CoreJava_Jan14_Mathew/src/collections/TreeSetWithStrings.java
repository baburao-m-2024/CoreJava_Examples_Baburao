package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithStrings {

	public static void main(String[] args) {

	//	Set<String> setObj = new TreeSet<String>(); // by default it sorts in alphabetical order
		RevAlphaComparator comp = new RevAlphaComparator();
		Set<String> setObj = new TreeSet<String>(comp);
		
		setObj.add("java");
		setObj.add("html");
		setObj.add("java");
		setObj.add("spring");
		setObj.add("angular");
		setObj.add("css");
		setObj.add("css");
		
		Iterator<String> itrObj = setObj.iterator();
		
		while(itrObj.hasNext()) {
			System.out.println(itrObj.next());
		}
		
	}

}
