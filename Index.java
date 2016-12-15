/**
 * @author amitsa
 */

import java.awt.List;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Hashtable; 
import java.util.ArrayList;

public class Index {
	Map <String, ArrayList<Posting<String, Integer>>> myMap;
	
	
	@SuppressWarnings("deprecation")
	public void createIndex (String filehtml, String url) throws MalformedURLException {
		 myMap = new Hashtable <String, ArrayList<Posting<String, Integer>>>();
				
		
		Posting<String, Integer> posting;		
		posting = new Posting<String, Integer>(url,0);

		/**
		 * tokens from split method in here
		 */
		
		
		for(String token : Tokens.tokens()){//θελει τον πινακα απο τη split
			
			if (myMap.containsKey(token)) {
				
				posting.setI(posting.getI()+1);
				
			} else {				
				posting.setI(1);
				
			}
			ArrayList<Posting<String, Integer>> myArrayList;
			myArrayList = new ArrayList<Posting<String, Integer>>();
			myArrayList.add(posting);
			myMap.put(token, myArrayList);
			
		}
		
		Sorting.writeIndexToFile(myMap);
		
				
	}

}
