package searchengine;

import java.text.Normalizer;

/**
 * Class with method that normalizes user's input.
 * With get method for access to normalized input.
 */

//create an object of GetInput class, to call the getInputTerm method.
public class InputNormalization {
  GetInput gi = new GetInput();
  private String inputTerm = gi.getInputTerm();

  //normalize input term
  public void normalizeInputTerm() {
    inputTerm = Normalizer.normalize(inputTerm, Normalizer.Form.NFD)
    .toLowerCase().replaceAll("[^a-zá-ùA-ZÁ-Ù0-9 ]", "");
  }

  public String getNormalizedInputTerm() {
    return this.inputTerm;
  }
}
