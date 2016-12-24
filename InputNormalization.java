package searchengine;

import java.text.Normalizer;

/**
 * Class that normalizes strings.
 */

//create an object of GetInput class, to call the getInputTerm method.
public class InputNormalization {
  GetInput gi = new GetInput();
  private String inputTerm = gi.getInputTerm();

  //normalize input term
  public void normalizeInputTerm() {
    inputTerm = Normalizer.normalize(inputTerm, Normalizer.Form.NFD)
    .toLowerCase().replaceAll("[^a-zα-ωA-ZΑ-Ω0-9 ]", "");
  }
  
  /**(new) method that normalizes a String
   * @param str input String to normalize.
   * @return String[] wordList that contains all the words. 
   */
  public static String[] normalizedStringArr(String str) {
    String nstr;
    nstr = Normalizer.normalize(str, Normalizer.Form.NFD)
    .toLowerCase().replaceAll("[^a-zα-ωA-ZΑ-Ω0-9 ]", " ");
    String[] wordList = nstr.split("\\s+");
    return wordList;
  }
  
  //get normalized input term.
  public String getNormalizedInputTerm() {
    return this.inputTerm;
  }
}
