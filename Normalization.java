package searchengine;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Class with methods to normalize user input text and text taken from HTML files, 
 * it also removes stop words from the latter. 
 * @author Nikos
 */
public class Normalization {
    
  /**
   * Normalizes user input text.
   * @param inputText : user input text
   * @return String[] inWords (no duplicate values)
   */
  public static String[] inputNormalization() {
    String inputText = GetInput.getInputTerm();
    inputText = Normalizer.normalize(inputText, Normalizer.Form.NFD);
    inputText = inputText.toLowerCase();
    inputText = inputText.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    List<String> mylist = Arrays.asList(inputText.split("[^a-zα-ω0-9]+"));
    Set<String> myhs = new HashSet<String>(mylist);
    String[] inWords = myhs.toArray(new String[myhs.size()]);
    return inWords;
  }

  /**
   * Normalizes text taken from HTML files.
   * @param htmlText : text from HTML
   * @return String[] wordList (contains duplicate values, does not contain stopwords)
   */
  public static String[] textNormalization(String htmlText) {
    htmlText = Normalizer.normalize(htmlText, Normalizer.Form.NFD);
    htmlText = htmlText.toLowerCase();
    htmlText = htmlText.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    String[] wordList = htmlText.split("[^a-zα-ω0-9]+");
    String[] nwl = StopWordsRemoval.removeStopWords(wordList);
    return nwl;
  }
}
