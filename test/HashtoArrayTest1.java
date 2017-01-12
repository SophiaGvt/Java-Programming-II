package javengers;

/**
 * @authors mmavreli, ptaniou
 */

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

import org.junit.Test;

public class HashtoArrayTest1 {

	@Test
	public void testH_t_a() {

		HashtoArray has = new HashtoArray();
		
		ArrayList<String> keys = has.h_t_a();
		
		ArrayList<String> actualkeys = null;
		
		actualkeys.add("august");
		actualkeys.add("authorities");
		actualkeys.add("be");
		actualkeys.add("certain");
		actualkeys.add("change");
		actualkeys.add("control");
		actualkeys.add("directly");
		actualkeys.add("do");
		actualkeys.add("document");
		actualkeys.add("does");
		actualkeys.add("easier");
		actualkeys.add("end"); 
		
		assertSame(keys, actualkeys);
		
		
		
	}

}
