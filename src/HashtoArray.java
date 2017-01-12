package javengers;

/**
 * @authors mmavreli, ptaniou
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class HashtoArray {
	
	/**
	 * @author of input methods Nikos  
	 */

	private Scanner scanner = new Scanner(System.in);
	private static String input;
	
	/**
	 * enter search term and add it in an variable named input
	 */
	
	public void inputTerm() {
		System.out.println("Enter search term: ");
		input = scanner.nextLine();
		
	}
	
	/**
	 * @return the variable input
	 */
	
	public static String getInputTerm() {
		return input;
	}
	
	/**
	 * Method that converts map from method sortingMap to an ArrayList 
	 * 
	 * @return the ArrayList with the keys
	 */
	
	public ArrayList<String> h_t_a () {
				
		ArrayList<String> column_1 = new ArrayList<String>();
		
		try {
			
			for(String key : SortingMap.sortingMap().keySet()) { 
			
				column_1.add(key);
			}
		} catch(Exception e) {
			
			System.out.println("File not found: " + e.getMessage());
		}
		
		return column_1;
	}
	
	/**
	 * Method that adds values in an ArrayList when the position of the value = the position of the key (mid)
	 * 
	 * @param mid, the position of each key
	 * @return the ArrayList with the values
	 */
	
	public ArrayList<Posting<String,Integer>> posting_to_col2(int mid) {
		
		ArrayList<Posting<String, Integer>> column_2 = new ArrayList<Posting<String, Integer>>();
		
		int place = 0;			// counts in which place is the value
		
			for(ArrayList<Posting<String, Integer>> value : SortingMap.sortingMap().values()) { 
				
			place = place + 1;
			
			// if place of key = place of value 
			if (mid == place ) {
			
				column_2.addAll(value);
			}
		}	
		
			return column_2;
	}   
	
	
	/*
	  Binary Search for ArrayList = A second way

	
	 public int binarySearch(ArrayList<String> column_1, String input) {
		 
		 int  mid = Collections.binarySearch(column_1,input);
		 
			 return mid;

	    } */
}
