 package javengers;
 
 /**
  * @authors mmavreli, ptaniou
  */

import java.util.ArrayList;
import java.util.Iterator;

public class SeMain {
	
	public static void main( String[] args) {
		
		//create object of class HashtoArray
		HashtoArray ha = new HashtoArray();
		
		//get input from user
		ha.inputTerm();
		String input = HashtoArray.getInputTerm(); 
		
		
		String inputText = Normalization.inputNormalization(input);	
		
		//convert myMap to ArrayList
		ArrayList<String> column_1 = ha.h_t_a();
			
		/*for (String nu : column_1) {
			 System.out.println(nu);
			} */
		
		int mid = search(inputText,column_1); 
		
		/* call method binarySearch to get the words = a second way
		int mid = ha.binarySearch(column_1, input);
		System.out.println(mid); */
		
		if (mid == -1) {
			
			System.out.println(" The word is not found.");
			
		} else {
		
			ArrayList<Posting<String, Integer>> column_2 = ha.posting_to_col2(mid);
		
			for ( int i = 0; i < column_2.size(); i++) {
			
				if (mid == i) {
				
					System.out.println(column_2.get(i).toString());
				
				}
			}
		}
		
	}
	
	/**
	 * Method that searches the ArrayList with the keys for the given word
	 * 
	 * @param searchStr = input from the user
	 * @param aList = ArrayList with the keys of map
	 * @return the position of the input
	 */
	
	public static int search(String searchStr, ArrayList<String> aList) {
	
	 
	boolean found = false;
	Iterator<String>  iter = aList.iterator();
	String curItem="";
	int pos=-1;
	 
	while ( iter .hasNext() == true )
	{
	    pos=pos+1;
	    curItem =(String) iter .next();
	    
	    if (curItem.equals(searchStr)  ) {
	    	found = true;
	    	break;
	    }
	 
	}
	 
	if ( found == false ) {
		pos=-1;
	}
	 
	 return pos;
	}
}



