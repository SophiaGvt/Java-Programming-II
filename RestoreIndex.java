import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;


public class RestoreIndex {
	/**
	 * 
	 * This constructs our index file back in memory as a map view
	 * to get used in the search
	 */
	//Map <String, ArrayList<Posting<String, Integer>>>
	public Map <String, ArrayList<Posting<String, Integer>>> readIndex() {
		
		String path = "C:\\Users\\amitsa\\Desktop\\java_programming_2\\Search Engine\\myIndex.txt";
		File file = new File(path);
		
		Map <String, ArrayList<Posting<String, Integer>>> myMap;
		myMap = new Hashtable <String, ArrayList<Posting<String, Integer>>>();
		
		
		Posting<String, Integer> posting;
		ArrayList<Posting<String, Integer>> myArrayList;
		myArrayList = new ArrayList<Posting<String, Integer>>();
		
		BufferedReader br = null;
		String  thisLine = null;
		String[] array1;
		String[] array2;
		String[] array3;
			      try{
			         // open input stream myIndex.txt for reading purpose.
			         br = new BufferedReader(new InputStreamReader(new FileInputStream(
								file)));
			         
			         while ((thisLine = br.readLine()) != null) {//each line is a pair of key word and its posting list
			        	 
			        	 //1st split: first element is the term, second its posting list
			            array1 = thisLine.split("-");
			           //2nd split: an array from postings
			            array2 = array1[1].split(";");
			            for (String aPosting : array2){
			            	
			            	//3rd split: first element is the url, 
			            	//second the times term appears in document
			            	array3 = aPosting.split(",");
			            	posting = new Posting<String, Integer>("",0);
			            	posting.setUrl(array3[0]);		  
			            	posting.setI(Integer.parseInt(array3[1]));//convert times from String to Integer
			            	myArrayList.add(posting);
			            	//store again into the map
			            	myMap.put(array1[0], myArrayList);
			            	
			            }
			            
			           
			         }       
			      }catch(Exception e){
			         e.printStackTrace();
			      }	finally {

						try {

							if (br != null)
								br.close();
						

						} catch (IOException ex) {

							ex.printStackTrace();

						}

					}
			      return myMap;
	}

}
