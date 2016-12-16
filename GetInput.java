package searchengine;

import java.util.Scanner;

/**
 * Class with method that gets String input from user.
 * Assigns input's value to variable.
 * With get method for that variable.
 */

public class GetInput {
	private Scanner scanner = new Scanner(System.in);
	private String input;

	public void promptTerm() {
		System.out.println("Enter search term: ");
        	input = scanner.nextLine();
    	}
	
	public String getInputTerm() {
    		return input;
	}
}
