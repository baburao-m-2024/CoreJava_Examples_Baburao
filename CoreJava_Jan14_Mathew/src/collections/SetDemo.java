package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		//Set<Object> setObj = new HashSet<Object>();
		Set<Object> setObj = new LinkedHashSet<Object>();
		
		setObj.add(90);
		setObj.add(40);
		setObj.add(90);
		setObj.add("java");
		setObj.add("html");
		setObj.add("css");
		setObj.add("java");
		
		Iterator<Object> itrObj = setObj.iterator();
		
		while(itrObj.hasNext()) {
			System.out.println(itrObj.next());
		}
		
	}

}
