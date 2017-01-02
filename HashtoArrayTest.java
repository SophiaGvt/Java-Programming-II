package searchengine;
/**
*@authors mmavreli, ptaniou
*/

import java.util.ArrayList;

public class HashtoArrayTest {

	public static void main( String[] args) {

		try {
			//create object of HashtoArray
			HashtoArray has = new HashtoArray();

			has.inputTerm();
			String input = has.getInputTerm();
			has.h_t_a();
			//create an ArrayList
			ArrayList<String> column_1 = null;
			has.binarySearch(column_1, input);

		} catch(Exception e) {

			System.out.println(e.getMessage());
		}

	}
}
