

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * ����� ��� ���������� ��� �������� ��� Map ��� ��� Index
 * �� ������� ����� �� Set �� �� ������� ��� ���������� ��� ��� ������ sortedMap
 * @author amitsa
 *
 */

public class Sorting {
	
	
	static TreeSet<String> sortedKeys;
	/**
	 * ������� ��� ������� ��� map ��� ���������� ��� Set ��� sortedKeys
	 * @param myMap
	 */
	public static  void sortedMap(
			Map<String, ArrayList<Posting<String, Integer>>> myMap) {
		
		Set<String> keys = myMap.keySet();
		sortedKeys = new TreeSet<>(keys);
		
		
		
	}


	
}

