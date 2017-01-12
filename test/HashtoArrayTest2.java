package javengers;

/**
 * @authors mmavreli, ptaniou
 */

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class HashtoArrayTest2 {

	@Test
	public void testPosting_to_col2() {

		HashtoArray has = new HashtoArray();
		
		int mid = 3;
		ArrayList<Posting<String, Integer>> values = has.posting_to_col2(mid);
		
		ArrayList<Posting<String, Integer>> actualvalues;
		
		actualvalues.add("https://accounts.google.com/TOS?loc=GR&hl=en&privacy=true",1);
		actualvalues.add("https://accounts.google.com/TOS?loc=GR&hl=en&privacy=true",2);
		actualvalues.add("https://accounts.google.com/TOS?loc=GR&hl=en&privacy=true,12;https://www.gerritcodereview.com/,2;http://lineageos.org/,1;http://lineageos.org/community/",1);
		actualvalues.add("https://accounts.google.com/TOS?loc=GR&hl=en&privacy=true",4);				
		actualvalues.add("https://accounts.google.com/TOS?loc=GR&hl=en&privacy=true",1);	
		actualvalues.add("https://www.gerritcodereview.com/,2;http://lineageos.org/community/",1);
		
		assertSame(values, actualvalues);
	}

}
