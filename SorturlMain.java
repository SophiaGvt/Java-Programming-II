/**
 * @authors mmavreli, ptaniou
 */

package searchengine;

import java.util.*;

public class SorturlMain {

	static Posting<String, Integer> post;

	public static void main(String[] args) {

		ArrayList<Posting<String, Integer>> postings = new ArrayList<Posting<String, Integer>>();
		Map<String, ArrayList<Posting<String, Integer>>> newmap;
		newmap = new Hashtable<String, ArrayList<Posting<String, Integer>>>();

		Posting<String, Integer> myP1 = new Posting<String, Integer>(
				"https:/en.wikipedia.org/wiki/George_Michael", 10);
		Posting<String, Integer> myP2 = new Posting<String, Integer>(
				"https://github.com/SophiaGvt/Java-Programming-II", 20);
		Posting<String, Integer> myP3 = new Posting<String, Integer>(
				"https://www.linkedin.com/", 30);
		Posting<String, Integer> myP4 = new Posting<String, Integer>(
				"http://www.bershka.com/gr/", 40);
		postings.add(myP1);
		postings.add(myP2);
		postings.add(myP3);
		postings.add(myP4);

		newmap.put("thanos", postings);
		newmap.put("eutuxia", postings);
		newmap.put("georgia", postings);
		newmap.put("Aggelikh", postings);

		// populate hash map
		// newmap.put("a", "biurjibru");
		// newmap.put("b", "juhvgufhevie");
		// newmap.put("c", "poiytt");
		// newmap.put("d", "arg1");

		int mid = 1;

		System.out.println(string_to_col1(mid, newmap));

		System.out.println(posting_to_col2(mid, newmap));

		ArrayList<Posting<String, Integer>> ptc = posting_to_col2(mid, newmap);

		System.out.println(convert_str(ptc));

		System.out.println(convert_int(ptc));
		
		
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.add("apple");
		ar1.add("big");
		ar1.add("table");
		ar1.add("chair");
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		ar2.add(2);
		ar2.add(9);
		ar2.add(12);
		ar2.add(8);
		
		System.out.print(sort(ar1, ar2));
	}

	public static ArrayList<String> string_to_col1(int mid,
			Map<String, ArrayList<Posting<String, Integer>>> map) {

		ArrayList<String> column_1 = new ArrayList<String>();

		int place = 0; // counts in which place is the value
		for (String key : map.keySet()) {// (ArrayList<Posting<String, Integer>>
											// value :
											// reind.readIndex().values()) {

			place = place + 1;

			// if place of key = place of value
			// if (mid == place /*&& (reind.readIndex(fileName).hasNext())*/ ) {

			column_1.add(key);// All(value);
			// }
		}

		return column_1;
	}

	public static ArrayList<Posting<String, Integer>> posting_to_col2(int mid,
			Map<String, ArrayList<Posting<String, Integer>>> map) {

		ArrayList<Posting<String, Integer>> column_2 = new ArrayList<Posting<String, Integer>>();

		int place = 0; // counts in which place is the value
		// for(String key : reind.readIndex().keySet()) {//
		for (ArrayList<Posting<String, Integer>> value : map.values()) {

			place = place + 1;

			// if place of key = place of value
			if (mid == place /* && (reind.readIndex(fileName).hasNext()) */) {

				column_2.addAll(value);// All(value);
			}
		}

		return column_2;
	}

	public static ArrayList<String> convert_str(
			ArrayList<Posting<String, Integer>> column_2) {

		ArrayList<String> arlist_str = new ArrayList<String>();

		// object of class Posting
		post = new Posting<String, Integer>();
		int size = column_2.size();

		for (int i = 0; i < size; i++) {

			arlist_str.add(post.getUrl());

		}

		return arlist_str;
	}

	public static ArrayList<Integer> convert_int(
			ArrayList<Posting<String, Integer>> column_2) {

		ArrayList<Integer> arlist_int = new ArrayList<Integer>();

		post = new Posting<String, Integer>();
		int size = column_2.size();

		for (int i = 0; i < size; i++) {

			arlist_int.add(post.getI());

		}

		return arlist_int;
	}

	public static ArrayList<String> sort(ArrayList<String> convert_str, ArrayList<Integer> convert_int) {

		int size = convert_str.size();

		if (size <= 1) {

			return convert_str;
		}

		for (int i = 0; i < size; i++) {

			int t1 = convert_int.get(i);
			int t2 = convert_int.get(i + 1);

			if (t1 <= t2) {

				convert_int.set(i, t2);
				convert_int.set(i + 1, t1);

				String t3 = convert_str.get(i);
				String t4 = convert_str.get(i + 1);

				convert_str.set(i, t4);
				convert_str.set(i + 1, t3);
			}

		}

		return convert_str;
	}

}
