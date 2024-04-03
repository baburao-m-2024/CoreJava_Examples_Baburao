package collections;

import java.util.ArrayList;

public class Collections_Intro_2 {

	public static void main(String[] args) {

		ArrayList<Object> listObj1 = new ArrayList<Object>();
		
		listObj1.add(90);
		listObj1.add("harsha");
		listObj1.add('M');
		listObj1.add("bharghav");
		listObj1.add(true);
		
		System.out.println("no of values in listObj1 are "+listObj1.size());
		listObj1.add(false);
		
		System.out.println("is value bharghav present in listObj1 or not "+listObj1.contains("bharghav"));
		listObj1.remove(90);
		System.out.println("After removing 90 from collection : "+listObj1.size());
		
		ArrayList<Object> listObj2 = new ArrayList<Object>();
		
		listObj2.add(40);
		listObj2.add(50);
		listObj2.add('F');
		listObj2.addAll(listObj1);
		
		System.out.println("is listObj1 present in listObj2 or not "+listObj2.containsAll(listObj1));
		
		listObj2.removeAll(listObj1);
		listObj2.retainAll(listObj1);
		
				
	}

}
