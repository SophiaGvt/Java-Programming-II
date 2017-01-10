package javengers;

/**
 * @author amitsa
 */

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;


public class SortingMap {
	
	@SuppressWarnings("null")
	public static Map<String, ArrayList<Posting<String, Integer>>> sortingMap() {
		
		RestoreIndex rIndex = new RestoreIndex();
		Map<String, ArrayList<Posting<String, Integer>>> sortedMap;
		Map<String, ArrayList<Posting<String, Integer>>> newMap = null;
				newMap = new Hashtable<String, ArrayList<Posting<String, Integer>>>();
		
		sortedMap = rIndex.readIndex();
		Sorting.sortedMap(sortedMap);
		
		for (String key : Sorting.sortedKeys) {
			
			newMap.put(key, sortedMap.get(key));
			
		}
		return newMap; 
		
		
	}
	
	

}
