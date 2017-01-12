package javengers;

/**
 * @authors mmavreli, ptaniou
 */

import java.util.ArrayList;

public class Sorturl {
	
	// Create an object of class RestoreIndex
	RestoreIndex reind = new RestoreIndex();
	
	Posting<String, Integer> posting;

	int mid;

	String input;
	
	
	/**
	 * Constructor 
	 * @param input from class HashtoArray, get input from user
	 * @param mid from HashtoArray (method binarySearch), get the place of the input 
	 */
	
	public Sorturl (String input, int mid) {
		
		this.input = input;	
		this.mid = mid;
	}
	
	
	ArrayList<String> arlist_str = new ArrayList<String>();
	ArrayList<Integer> arlist_int = new ArrayList<Integer>();
	
	
	/**
	 * Convert Posting<String,Integer> to ArrayList<String>
	 * 
	 */
	
	public ArrayList<String> getArUrl (){
		
		for(String key : SortingMap.sortingMap().keySet()) {
			
			for (Posting<String,Integer> posting:SortingMap.sortingMap().get(key)) {
				
				arlist_str.add(posting.getUrl());
		
			}
		}
		
		return arlist_str;
	}
	
	/**
	 * Convert Posting<String,Integer> to ArrayList<Integer>
	 */
	
	public ArrayList<Integer> getArInt (){
		
		for(String key : SortingMap.sortingMap().keySet()) {
			
			for (Posting<String,Integer> posting:SortingMap.sortingMap().get(key)) {
				
				arlist_int.add(posting.getI());
			}
		}
		
		return arlist_int;
	}
	
	/**
	 * Method that sorts the frequency (how many times the given word is appeared) and the same time sorts the urls
	 * 
	 * @param convert_str = ArrayList with url
	 * @param convert_int = ArrayList with the frequency
	 * @return a sorted ArrayList with url
	 */
	
	public ArrayList<String> sort(ArrayList<String> convert_str, ArrayList<Integer> convert_int) {
		
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