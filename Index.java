//package javengers;




import java.net.MalformedURLException;
import java.util.Map;
import java.util.Hashtable;
import java.util.ArrayList;
/**
 * Κλάση Index για δημιουργία ευρετηρίου. Χρήση map για την αποθήκευση των λέξεων
 * κλειδιών.
 * @author amitsa
 *
 */
public class Index {


	static Map <String, ArrayList <Posting<String, Integer>>> myMap = new Hashtable <String, ArrayList <Posting<String, Integer>>>();

/**
 *
 * @param url τα url που δέχεται από το crawler
 * @param tokens ο πίνακας από τις λέξεις που περιλαμβάνονται στο αρχείο με το αντίστοιχο url
 * @throws MalformedURLException
 */

	public static void createIndex (String url, String[] tokens) throws MalformedURLException {



		Posting<String, Integer> posting;

		Posting<String, Integer> myPosting;

		ArrayList<Posting<String, Integer>> myArrayList;




		for(String token : tokens){//πίνακας που προκύπτει απο την textNormalization

			if (myMap.containsKey(token)) {

					//έλεγχος περίπτωσης αν η λέξη υπάρχει στο url που ήδη
					myPosting = myMap.get(token).get(myMap.get(token).size()-1);

					if(myPosting.getUrl().equals(url)) {
						myPosting.setI(myPosting.getI()+1);

					//έελγχος αν η λέξη edw einai h periptwsh poy yparxei h leksh alla se diaforetiko url
					} else {
						posting = new Posting<String, Integer>(url,0);
						posting.setI(1);
						myMap.get(token).add(posting);

					}

			//edw einai h periptwsh poy den yparxei h leksh kai apothikeuetai 1h fora
			} else {

				posting = new Posting<String, Integer>(url,0);
				posting.setI(1);

				myArrayList = new ArrayList<Posting<String, Integer>>();
				myArrayList.add(posting);
				myMap.put(token, myArrayList);
			}


		}


	}

}