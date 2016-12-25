package searchengine;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Class with methods to normalize user input text and text taken from html files.
 * @author Nikos
 */

public class Normalization {

  /**
   * Normalizes user input text.
   * @param inputText : user input text
   * @return String[] inWords (no duplicate values)
   */
  public String[] inputNormalization(String inputText) {
    inputText = Normalizer.normalize(inputText, Normalizer.Form.NFD)
                .toLowerCase().replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    List<String> mylist = Arrays.asList(inputText.split("[^a-zá-ù0-9]+"));
    Set<String> myhs = new HashSet<String>(mylist);
    String[] inWords = myhs.toArray(new String[myhs.size()]);
    return inWords;
  }

  /**
   * Normalizes text taken from html files.
   * @param htmlText : text from html
   * @return String[] wordList (contains duplicate values)
   */
  public String[] textNormalization(String htmlText) {
    htmlText = Normalizer.normalize(htmlText, Normalizer.Form.NFD)
               .toLowerCase().replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    String[] wordList = htmlText.split("[^a-zá-ù0-9]+");
    return wordList;
  }
}
