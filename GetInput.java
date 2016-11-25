import java.util.Scanner;
/**
 * Class with method that gets String input from user.
 * Assigns input's value to variable.
 * And also contains get method for that variable.
 */
public class GetInput {
	private Scanner sNew = new Scanner(System.in);
	private String input;

	public void promptTerm() {
		System.out.println("Enter search term: ");
        	input = sNew.nextLine();
    	}
	public String getTerm() {
    		return input;
	}
}
