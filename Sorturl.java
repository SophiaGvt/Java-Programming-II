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
		
		int place = 0;			// counts in which place is the value
		for(ArrayList<Posting<String, Integer>> value : reind.readIndex().values()) {
			
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
	
	/**
	 * Convert Posting<String,Integer> to ArrayList<Integer>
	 */
	
	public ArrayList<Integer>  convert_int(ArrayList<Posting<String, Integer>> column_2) {
		
		ArrayList<Integer> arlist_int = new ArrayList<Integer>();
		post = new Posting<String, Integer>();
		int size = column_2.size();
		
		for(int i = 0; i < size; i++) {
			
			arlist_int.add(post.getI());
			
		}
		
		return arlist_int;
	}
		
	
	public static ArrayList<String> sort(ArrayList<String> convert_str, ArrayList<Integer> convert_int) {
		
		int size = convert_str.size() ;
		
		if(size <= 1) {
			
			return convert_str;
		}
		
		for(int i =0; i < size; i++) {
			
			int t1 = convert_int.get(i);
			int t2 = convert_int.get(i+1);
			
			if(t1 <= t2) {
				
				convert_int.set(i,t2);
				convert_int.set(i+1,t1);
				
				String t3 = convert_str.get(i);
				String t4 = convert_str.get(i+1);
				
				convert_str.set(i,t4);
				convert_str.set(i+1,t3);
			}	
			
		}
		
		return convert_str;
	}

}

