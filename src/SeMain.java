package javengers;

/**
 * @authors mmavreli, ptaniou, epapanikolaou
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class SeMain {

	public static void main(String[] args) {

		// create object of class HashtoArray
		HashtoArray ha = new HashtoArray();

		// get input from user
		ha.inputTerm();
		String input = HashtoArray.getInputTerm();

		String inputText = Normalization.inputNormalization(input);

		// convert myMap to ArrayList
		ArrayList<String> column_1 = ha.h_t_a();

		int mid = search(inputText, column_1);

		/*
		 * create object of class MySEOFrame get JButton and activate
		 * ActionListener
		 */

		MySEOFrame f = new MySEOFrame();
		f.frame();
		f.getJButton().addActionListener(new ActionListener() {

			private ArrayList<String> results;

			public void actionPerformed(ActionEvent e) {

				results = getResults(mid, input);
				JOptionPane.showMessageDialog(null, "Your results are:"
						+ results);
			}
		});

	}

	/*
	 * call method binarySearch to get the words = a second way int mid =
	 * ha.binarySearch(column_1, input);
	 */

	public static ArrayList<String> getResults(int mid, String input) {

		// create object of class Sorturl
		Sorturl su = new Sorturl(input, mid);
		ArrayList<String> url = null;
		// System.out.println(mid);

		if (mid == -1) {

			url.add("The word is not found");
		} else {

			HashtoArray ha = new HashtoArray();
			ArrayList<Posting<String, Integer>> column_2 = ha
					.posting_to_col2(mid);

			for (int i = 0; i < column_2.size(); i++) {

				if (mid == i) {

					url = su.getArUrl();
					// ArrayList<Integer> frequency = su.getArInt();


				}
			}
		}

		return url;
	}

	/**
	 * Method that searches the ArrayList with the keys for the given word
	 * 
	 * @param searchStr
	 *            = input from the user
	 * @param aList
	 *            = ArrayList with the keys of map
	 * @return the position of the input
	 */

	public static int search(String searchStr, ArrayList<String> aList) {

		boolean found = false;
		Iterator<String> iter = aList.iterator();
		String curItem = "";
		int pos = -1;

		while (iter.hasNext() == true) {
			pos = pos + 1;
			curItem = (String) iter.next();

			if (curItem.equals(searchStr)) {
				found = true;
				break;
			}

		}

		if (found == false) {
			pos = -1;
		}

		return pos;

	}
}
