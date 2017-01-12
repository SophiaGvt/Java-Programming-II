import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 * Κλάση η οποία γράφει το map σε αρχείο με αλφαβητική σειρα
 * με την μορφή λέξη-http://example1,10;http://example2,20;
 * κάθε γραμμή είναι η λέξη που περιέχεται στο map με την τιμή της
 * @author amitsa
 *
 */
public class Writer {
	
	public static void writeIndexToFile(
			Map<String, ArrayList<Posting<String, Integer>>> myMap) {
		//path στο οποίο αποθηκευέται το αρχείο στον υπολογιστή μου
		String path = "C:\\Users\\amitsa\\Desktop\\java_programming_2\\Search Engine\\myIndex.txt";
		File myIndex = new File(path);
		
		
		
		
		
		Sorting.sortedMap(myMap);//κλήση της Sorting για ταξινόμηση με αλφαβητική σειρά
		ArrayList<Posting<String, Integer>> myPostingList;
		FileWriter output = null;
		try {
			 output = new FileWriter(myIndex);
		} catch (IOException e) {
			
			e.printStackTrace();
		}//για όλα τα ταξινομημένα key του map
		for (String key : Sorting.sortedKeys) {
			
			
			
			try {
				output.write(String.format("%s-", key));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
			
			myPostingList = myMap.get(key);//τιμή της λέξης-το arraylist με τα posting			
			for(Posting<String,Integer> myPosting : myPostingList) {//για κάθε στοιχείο του arraylist της κάθε λέξης γράψε:
					
					try {
						output.write(String.format("%s,%d;",  myPosting.getUrl(), myPosting.getI() ));
					} catch (IOException e) {
						
						e.printStackTrace();
					}
			}
			try {
				output.write("\r\n");//εκτυπώνει μία κενή σειρά για την επόμενη λέξη(χρησιμεύει στην restoreIndex όταν διαβάζει το αρχέιο γραμμή γραμμή)
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		try {//κλείσιμο του αρχείου
			output.flush();
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
