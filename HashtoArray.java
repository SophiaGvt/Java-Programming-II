/**
 * @authors mmavreli, ptaniou
 */

package searchengine;

import java.util.ArrayList;
import java.util.Scanner;

public class HashtoArray {
	
	/**
	 * Class with method that gets String input from user Assigns input's value
	 * to variable. With get method for that variable.
	 */

	private Scanner scanner = new Scanner(System.in);
	private String input;
	

	public void inputTerm() {
		System.out.println("Enter search term: ");
		input = scanner.nextLine();
	}

	public String getInputTerm() {
		return input;
	}
	
	/**
	 * convert myMap to ArrayList
	 */
	
	public ArrayList<String> h_t_a () {
		
		
		 // Create object of class RestoreIndex
		RestoreIndex ind = new RestoreIndex();
		
		ArrayList<String> column_1 = new ArrayList<String>();
		
		String fileName = null;
		for(String key : ind.readIndex(fileName).keySet()) {
			
			column_1.add(key);
		}
		
		return column_1;
	}
	
	/**
	 * Binary Search for ArrayList
	 */
	private final static int NOT_FOUND = -1;
	
	 public static int binarySearch(ArrayList<String> column_1, String input) {

	        int low = 0;
	        int high = column_1.size() - 1;
	        int mid = (low + high) / 2;

	        while (low <= high && !column_1.get(mid).equalsIgnoreCase(input)) {

	            if (column_1.get(mid).compareTo(input) < 0) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }

	            mid = (low + high) / 2;

	            if (low > high) {
	                mid = NOT_FOUND;
	            }

	        }
	        return mid;

	    }
}
