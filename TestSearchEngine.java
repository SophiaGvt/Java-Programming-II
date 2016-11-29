import java.util.Scanner;

public class TestSearchEngine {
	public static void main(String[] args) {
		Scanner input = new SCanner(System.in);

		try {
			//connection with given database


			System.out.println("Enter search words:");
			String searchWord = input.nextLine();

			//sql looking for proper results

			while(input.hasNext()) {
				System.out.println(+ input.getString("//database"));
			}
		}
		catch(Exception e) {
			System.out.println("Error!");
		}
	}
}
