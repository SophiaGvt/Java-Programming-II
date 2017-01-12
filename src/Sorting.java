

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Κλάση για ταξινόμηση των κλειδιών του Map απο την Index
 * με στατικό πεδίο το Set με τα κλειδιά που προκύπτουν από την μέθοδο sortedMap
 * @author amitsa
 *
 */

public class Sorting {
	
	
	static TreeSet<String> sortedKeys;
	/**
	 * Μέθοδος που δέχεται ένα map και δημιουργεί ένα Set απο sortedKeys
	 * @param myMap
	 */
	public static  void sortedMap(
			Map<String, ArrayList<Posting<String, Integer>>> myMap) {
		
		Set<String> keys = myMap.keySet();
		sortedKeys = new TreeSet<>(keys);
		
		
		
	}


	
}

