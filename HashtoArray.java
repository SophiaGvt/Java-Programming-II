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
	 * convert Hashmap to ArrayList
	 */
	
	public void h_t_a () {
		
		
		 // Create object of class RestoreIndex
		RestoreIndex ind = new RestoreIndex();
		
		ArrayList<String> column_1 = new ArrayList<String>();
		
		String fileName = null;
		for(String key : ind.readIndex(fileName).keySet()) {
			
			column_1.add(key);
		}
		
	}
}