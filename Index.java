import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Hashtable; 
import java.util.ArrayList;

public class Index {
	Map <String, ArrayList <Posting<URL, Integer>>> myMap;
	
	
	@SuppressWarnings("deprecation")
	public void createIndex (File filehtml) {
		 myMap = new Hashtable <String, ArrayList <Posting<URL, Integer>>>();
				
		//@SuppressWarnings("deprecation") 
		//try {
		Posting<URL, Integer> posting;		
		posting = new Posting<URL, Integer>(filehtml.toURL(),0);

		//εδω η split θα βγαζει ενα πινακα απο token
		String[] tokens;
		Integer times = 0;
		for(String token : tokens){
			
			if (myMap.containsKey(token)) {
				times++;
				posting.setI(times);
				
			} else {
				//times = 1;
				posting.setI(1);
				//myMap.put(token, posting);
			}
			myMap.put(token, posting);
			
		}
		Sorting.sortedMap(myMap);
		
		
				
	}

}
