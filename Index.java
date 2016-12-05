import java.net.URL;
import java.util.Map;
import java.util.Hashtable; 
import java.util.ArrayList;

public class Index {
	Map <String, ArrayList <URL>> sUrl;
	Map <String, ArrayList <int>> sTimes;
	
	public void createIndex () {//παιρνει ως ορισμα το αρχειο html
		 sUrl = new Hashtable <String, ArrayList <URL>>();
		 sTimes = new HashTable <String, ArrayList<int>>();
		
		//εδω χωριζει τις λεξεις με τη split και θα τις αποθηκευει σε πινακα
		int times = 0;
		for (String token : tokens) {
			
			sUrl.put(token, URL);
			if (sUrl.containsKey(token)) {
				times++;
				sTimes.put(token, times);
										
			} else {
				sTimes.put(token, 1);
								
			}
		}
	
	
		
	}

}
