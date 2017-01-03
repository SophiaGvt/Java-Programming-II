/**
 * @authors mmavreli, ptaniou
 */

package searchengine;

import java.util.ArrayList;

public class Sorturl {
	
	// Create an object of class RestoreIndex
	RestoreIndex reind = new RestoreIndex();
	
	Posting<String, Integer> post;

	private int mid;

	private String input;
	
	
	
	/**
	 * Constructor 
	 * @param input from class HashtoArray, get input from user
	 * @param mid from HashtoArray (method binarySearch), get the place of the input 
	 */
	
	public Sorturl (String input, int mid) {
		
		this.input = input;	
		this.mid = mid;
	}
	
	/**
	 * Split myMap to an ArrayList<Posting<String,Integer>>
	 * @return Posting<String,Integer>
	 */
	
	public ArrayList<Posting<String,Integer>> posting_to_col2(int mid) {
		
		ArrayList<Posting<String, Integer>> column_2 = new ArrayList<Posting<String, Integer>>();
		
		String fileName = null;
		int place = 0;			// counts in which place is the value
		for(ArrayList value : reind.readIndex(fileName).values()) {
			
			place = place + 1;
			
			// if place of key = place of value 
			if (mid == place /*&& (reind.readIndex(fileName).hasNext())*/ ) {
			
				column_2.addAll(value);
			}
		}	
		
			return column_2;
	}
	
	/**
	 * Convert Posting<String,Integer> to ArrayList<String>
	 */
	
	public ArrayList<String> convert_str(ArrayList<Posting<String, Integer>> column_2 ) {
		
			ArrayList<String> arlist_str = new ArrayList<String>();
			
			//object of class Posting
			post = new Posting<String, Integer>();
			int size = column_2.size();
			
			for(int i = 0; i < size; i++) {
				
				arlist_str.add(post.getUrl());
				
			}
		
			return arlist_str;
	}
	
}
