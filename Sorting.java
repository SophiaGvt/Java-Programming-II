//ταξινομηση πινακων

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class Sorting {
	
	//private static Formatter output;
	static TreeSet<String> sortedKeys;
	public static void sortedMap(
			Map<String, ArrayList<Posting<String, Integer>>> myMap) {
		
		Set<String> keys = myMap.keySet();
		sortedKeys = new TreeSet<>(keys); 
		
	}


	
}

