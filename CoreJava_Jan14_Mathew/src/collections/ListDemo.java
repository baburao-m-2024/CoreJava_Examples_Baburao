package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		//List<Object> listObj = new ArrayList<Object>();
		
		List<Object> listObj = new LinkedList<Object>();
		
		listObj.add(90);
		listObj.add(40);
		listObj.add(30);
		listObj.add("harsha");
		listObj.add(90);
		listObj.add("harsha");
		listObj.add("java");
		
		Iterator<Object> itrObj = listObj.iterator();
		
		while(itrObj.hasNext()) {
			System.out.println(itrObj.next());
		}
		
		
	}

}

