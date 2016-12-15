//ταξινομηση πινακων

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class Sorting {
	
	private static Formatter output;
	static TreeSet<String> sortedKeys;
	public static void sortedMap(
			Map<String, ArrayList<Posting<String, Integer>>> myMap) {
		
		Set<String> keys = myMap.keySet();
		sortedKeys = new TreeSet<>(keys); 
		
	}
	
	public static void writeIndexToFile(
			Map<String, ArrayList<Posting<String, Integer>>> myMap) {
		
		String path = "C:\\Users\\amitsa\\Desktop\\java_programming_2\\SearchEngine\\myIndex";
		File f = new File(path);
		
		try {
			output = new Formatter(f);
		}
		catch (FileNotFoundException e) {
			System.err.println("Unable to open file: " 
				+ e.getMessage());

		}
		catch (SecurityException securityException) {
			
			System.err.println("Write permission denied. Terminating. ");
			System.exit(1);
		}
		sortedMap(myMap);
		ArrayList<Posting<String, Integer>> myPostingList;
		for (String key : sortedKeys) {
			
			output.format("%s|", key);
			
			myPostingList = myMap.get(key);
			
				for(Posting<String,Integer> myPosting : myPostingList) {
				output.format("%s, %d; ",  myPosting.getUrl(), myPosting.getI() );
				}
		}
	}

	
}

