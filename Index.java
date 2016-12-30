/**
 * @author amitsa
 */


import java.net.MalformedURLException;
import java.util.Map;
import java.util.Hashtable; 
import java.util.ArrayList;

public class Index {
	static Map <String, ArrayList<Posting<String, Integer>>> myMap;
	
	
	
	public void createIndex (String url, String[] tokens) throws MalformedURLException {
		 myMap = new Hashtable <String, ArrayList<Posting<String, Integer>>>();
				
		
		 
		Posting<String, Integer> posting;		
		
		Posting<String, Integer> myPosting;
		
		ArrayList<Posting<String, Integer>> myArrayList;
		

		/**
		 * tokens from split method in here
		 */
		
		//String example = "At the age of 19, Michael told Andrew Ridgeley and close friends that he was bisexual. Michael also told one of his two sisters, but he was advised by friends not to tell his parents about his sexuality.";
		//String ex1 = "AGE, age, Age Michael";
		
		for(String token : tokens){//o pinakas poy prokyptei apo th split
			
			if (myMap.containsKey(token)) {
												
					//edw elegxw thn periptwsh h leksh na yparxei mesa sto idio url
					myPosting = myMap.get(token).get(myMap.get(token).size()-1);
					if(myPosting.getUrl().equals(url)) {
						myPosting.setI(myPosting.getI()+1);
					} else {//edw einai h periptwsh poy yparxei h leksh alla se diaforetiko url
						posting = new Posting<String, Integer>(url,0);
						posting.setI(1);
						myMap.get(token).add(posting);
						 
					}
												
			} else {//edw einai h periptwsh poy den yparxei h leksh kai apothikeuetai 1h fora				
				
				posting = new Posting<String, Integer>(url,0);
				posting.setI(1);				
				
				myArrayList = new ArrayList<Posting<String, Integer>>();
				myArrayList.add(posting);
				myMap.put(token, myArrayList);
			}
			
			
			
		}
		
		//Sorting.sortedMap(myMap);
		
		
						
	}

}
