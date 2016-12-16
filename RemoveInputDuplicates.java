package searchengine;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Class with method that removes duplicates from user input.
 */

public class RemoveInputDuplicates {
  StringNormalization sn = new StringNormalization();
  String normalizedTerm = sn.getNormalizedInputTerm();
 
  /**
   * Method that removes duplicates from user input. Using LinkedHashSet to preserve input order.
   */
  
  public Set<String> removeDuplicatesInput() {
    List<String> mylist = Arrays.asList(normalizedTerm.split(" "));
    Set<String> mylhs = new LinkedHashSet<String>(mylist);
    return mylhs;
  }
}
