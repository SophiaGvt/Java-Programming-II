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

			//get input from user
			has.inputTerm();
			String input = has.getInputTerm();
			
			//convert myMap to ArrayList
			ArrayList<String> column_1 = has.h_t_a();
			
			//call method binarySearch to get the words
			int mid = has.binarySearch(column_1, input);
			
			//object of Sorturl
			Sorturl su = new Sorturl(input, mid);
			
			//call methods of Sorturl
			ArrayList<Posting<String, Integer>> column_2 = su.posting_to_col2(mid);
			ArrayList<String> arlist_str = su.convert_str(column_2);
			ArrayList<Integer> arlist_int = su.convert_int(column_2);
			ArrayList<String> finalarraylist = su.sort(arlist_str, arlist_int);
			
			//print the results ( word & url )
			System.out.println(input + finalarraylist);
						
		} catch(Exception e) {

			System.out.println(e.getMessage());
		}

	}
}
