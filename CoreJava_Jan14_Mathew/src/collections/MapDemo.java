package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		//Map<Object, Object> mapObj = new HashMap<Object, Object>();
		Map<Object, Object> mapObj = new LinkedHashMap<Object, Object>();
		
		mapObj.put("id",  90);  // Each Key and Value pair is called as Entry
		mapObj.put("id",  70);
		mapObj.put("rollNo",  70);
		mapObj.put(90.45, "aggr");
		mapObj.put(5.4, "marks");
		mapObj.put("result",  true);
		
		Set<Entry<Object, Object>> setOfEntries = mapObj.entrySet();
		
		Iterator<Entry<Object, Object>> itrObj = setOfEntries.iterator();
		
		while(itrObj.hasNext()) {
			  Entry<Object, Object> entryObj = itrObj.next();
			  
			  System.out.println(entryObj.getKey()+" -- "+entryObj.getValue());
		}
		
		
	}

}
