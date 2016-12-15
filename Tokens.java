import java.util.Arrays;
import java.util.LinkedList;


public class Tokens {
	
	public static String[] tokens(String[] wordList) {//εδω θα παιρνουμε τον πινακα που προκυπτει απο τη split
		
		LinkedList<String> newWordList;
		newWordList = new LinkedList<String>(Arrays.asList(wordList));
		
		//stopwords array in here
		LinkedList<String> newStopWords;
		newStopWords = new LinkedList<String>(Arrays.asList(RemoveStopWords.stopwords));
		
		for(String word : newWordList) {
			
			for(String stopword : newStopWords){
				//if word from wordList is equal with a stopword then remove
				if(word == stopword) {
					
					newWordList.remove(word);
				}
			}
		}
		
		return newWordList.toArray(new String[newWordList.size()]);
	}

}
