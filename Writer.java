import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class Writer {
	
	public static void writeIndexToFile(
			Map<String, ArrayList<Posting<String, Integer>>> myMap) {
		
		String path = "C:\\Users\\amitsa\\Desktop\\java_programming_2\\Search Engine\\myIndex.txt";
		File myIndex = new File(path);
		
		
		
		
		
		Sorting.sortedMap(myMap);
		ArrayList<Posting<String, Integer>> myPostingList;
		FileWriter output = null;
		try {
			 output = new FileWriter(myIndex);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		for (String key : Sorting.sortedKeys) {
			
			
			//String formatStr = "%s|";
			try {
				output.write(String.format("%s-", key));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			myPostingList = myMap.get(key);			
			for(Posting<String,Integer> myPosting : myPostingList) {
					
					try {
						output.write(String.format("%s,%d;",  myPosting.getUrl(), myPosting.getI() ));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			try {
				output.write("\r\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		try {
			output.flush();
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
