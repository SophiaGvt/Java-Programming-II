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
	public void createIndex (String url) throws MalformedURLException {
		 myMap = new Hashtable <String, ArrayList<Posting<String, Integer>>>();
				
		
		Posting<String, Integer> posting;		
		posting = new Posting<String, Integer>(url,0);
		
		ArrayList<Posting<String, Integer>> myArrayList;
		myArrayList = new ArrayList<Posting<String, Integer>>();

		/**
		 * tokens from split method in here
		 */
		
		
		for(String token : Tokens.tokens()){//o pinakas poy prokyptei apo th split
			
			if (myMap.containsKey(token)) {
				
				
				for(Posting<String, Integer> aPosting : myMap.get(token)) {
					//edw elegxw thn periptwsh h leksh na yparxei mesa sto idio url
					if(aPosting.getUrl().equals(url)) {
						aPosting.setI(posting.getI()+1);
					} else {//edw einai h periptwsh poy yparxei h leksh alla se diaforetiko url
						
						posting.setI(1);
						myMap.get(token).add(posting);
						break;//edw afou evale to posting den xreiazetai 
						//na synexisei to loup opote break  
					}
				}
				
				
			} else {//edw einai h periptwsh poy den yparxei h leksh kai apothikeuetai 1h fora				
				posting.setI(1);
				
				myArrayList.add(posting);
				myMap.put(token, myArrayList);
			}
			
			
			
		}
		
		Sorting.writeIndexToFile(myMap);
		
				
	}

}
