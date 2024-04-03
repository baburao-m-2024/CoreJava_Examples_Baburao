package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		Map<String, Object> mapObj = new TreeMap<String, Object>();
		
		mapObj.put("html", 2000);
		mapObj.put("java",  5000);
		mapObj.put("html", "web pages");
		mapObj.put("spring", 9500);
		mapObj.put("sql",  true);
		mapObj.put("angular", "framework");
		
		Set<Entry<String, Object>> setOfEntries = mapObj.entrySet();
		
		Iterator<Entry<String, Object>> itrObj = setOfEntries.iterator();
		
		while(itrObj.hasNext()) {
			  Entry<String, Object> entryObj = itrObj.next();
			  System.out.println(entryObj.getKey()+" -- "+entryObj.getValue());
		}
		
	}

}
