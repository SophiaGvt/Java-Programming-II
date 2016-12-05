//ταξινομηση πινακων
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Sorting {
	public static void sortedMaps (Map <String, ArrayList <URL>> map1, Map <String, ArrayList <int>> map2) {
		
		Set<String> keys1 = map1.keySet();
		HashSet<String> sortedKeys1 = new HashSet<>(keys1); 
		
		Set<String> keys2 = map2.keySet();
		HashSet<String> sortedKeys2 = new HashSet<>(keys2); 
	}

}
