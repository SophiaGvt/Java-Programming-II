package javengers;

import java.text.Normalizer;

/**
 * Class with methods to normalize user input text and text taken from HTML files, 
 * it also removes stop words from the latter. 
 * 
 * @author Nikos
 */
public class Normalization {
    
  /**
   * Method that normalizes user input text.
   * 
   * @param inputText : user input text to normalize
   * @return inputText : normalized user input text
   */
  public static String inputNormalization(String inputText) {
    try {
      // Seperate accent marks from text
      inputText = Normalizer.normalize(inputText, Normalizer.Form.NFD);
      // Remove the seperated accent marks
      inputText = inputText.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
      // Lower case 
      inputText = inputText.toLowerCase();
      // Remove all non alphanumerical characters
      inputText = inputText.replaceAll("[^a-zα-ω0-9]+", "");
      return inputText;
    } catch (Exception ex) {
      return null;
    }
  }

  /**
   * Method that normalizes text taken from HTML files and removes stop words from it.
   * 
   * @param htmlText : text from HTML to normalize
   * @return : String[] wordList (contains duplicate values, does not contain stop words)
   */
  public static String[] textNormalization(String htmlText) {
    try {
      // Seperate accent marks from text
      htmlText = Normalizer.normalize(htmlText, Normalizer.Form.NFD);
      // Remove the seperated accent marks
      htmlText = htmlText.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
      // Lower case
      htmlText = htmlText.toLowerCase();
      // split using all non alphanumerical characters as delimiters
      String[] wordList = htmlText.split("[^a-zα-ω0-9]+");
      // Remove stop words from wordList
      String[] nwl = StopWordsRemoval.removeStopWords(wordList);
      return nwl;
    } catch (Exception ex) {
      return null;
    }
  }
}
