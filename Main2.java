import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class Main2 {
	
	public static void main(String args[]) {
		
		
		String[] urls = {"https:/en.wikipedia.org/wiki/George_Michael",
				"https://el.wikipedia.org/wiki/McDonald's"}; 
		String[][] tokens = {{"aggelikh", "aggelikh",
				"Eytyxia", "eytyxia"}, 
				{"aggelikh", "aggelikh",
					"Eytyxia", "eytyxia"}};                
		
		try {
				Index in;
				in = new Index();
				in.createIndex(urls[0], tokens[0]);				
				in.createIndex(urls[1], tokens[1]);
			
			
			
			
		} catch (MalformedURLException e) {
	
			e.printStackTrace();
		}
		
		Iterator<Entry<String, ArrayList<Posting<String, Integer>>>> it = Index.myMap.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry<String, ArrayList<Posting<String, Integer>>> pair ;
	        pair = (Map.Entry<String, ArrayList<Posting<String, Integer>>>)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue().toString());
	        
	        
	         
	    }
	}

}
