package searchengine;

import java.util.Scanner;

/**
 * Class with method that gets String input from user
 * Assigns input's value to variable.
 * With get method for that variable.
 */
public class GetInput {
	private Scanner scanner = new Scanner(System.in);
	private static String input;

	public static void promptTerm() {
		System.out.println("Enter search term: ");
        	input = scanner.nextLine();
    	}
	
	public static String getInputTerm() {
    		return GetInput.input;
	}
}
