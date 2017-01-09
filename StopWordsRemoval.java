package javengers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Class with method that removes stop words from String[].
 * 
 * @author amitsa, Nikos
 */
public class StopWordsRemoval {

  /**
  * Method that removes stop words from String[].
  *
  * @param input : String[] to remove stop words from
  * @return nwl : String[] without stop words
  */
  public static String[] removeStopWords(String[] input) {

    final String[] stopwords = { "a", "about", "above", "across", "after", "ago", "although", "an",
      "and", "as","at", "b", "because", "before", "below", "beside", "but", "by", "c", "d", "e",
      "f", "for", "from", "g","h", "he", "her", "hers", "herself", "him", "himself", "his", "i",
      "in", "into", "it", "its", "itself","j", "k", "l", "m", "me", "mine", "myself", "n", "not",
      "o", "of", "off", "on", "onto", "or", "ours","ourselves", "over", "p", "past", "q", "r", "s",
      "she", "since", "so", "t", "the", "theirs", "them","themselves", "they", "through", "till",
      "to", "towards", "u", "under", "unless", "until", "us", "v","w", "we", "whereas", "while",
      "x", "y", "yet", "you", "yours", "yourselves", "youself", "z", "α","αλλα", "αλλος", "αμα",
      "αμφι", "αν", "ανα", "ανευ", "αντι", "απο", "αρα", "αυτα", "αυτες", "αυτη","αυτην", "αυτης",
      "αυτο", "αυτοι", "αυτον", "αυτος", "αυτου", "αυτους", "αυτων", "αφοτου", "αφου", "β","γ",
      "για", "γιατι", "δ", "δηλαδη", "δια", "διχως", "ε", "εαν", "εγω", "εις", "ειτε", "εκ", 
      "εκεινη","εκεινο", "εκεινος", "εκτος", "εμας", "εμεις", "εμενα", "εν", "ενα", "εναν",
      "εναντιον", "ενας","ενεκα", "ενος", "εντος", "ενω", "εξαιτιας", "επειδη", "επι", "επομενως",
      "εσας", "εσεις", "εσενα","εσυ", "ετουτη", "ετουτο", "ετουτος", "εως", "ζ", "η", "θ", "ι",
      "ισαμε", "κ", "καθε", "καθεμια","καθενα", "καθενας", "καθετι", "καθως", "και", "καμια",
      "καμποση", "καμποσο", "καμποσος", "κανεις","κανενα", "κανενας", "καποια", "καποιο",
      "καποιος", "κατα", "κατι", "κατιτι", "κι", "λ", "λογω","λοιπον", "μ", "μα", "μας", "με",
      "μερικα", "μερικες", "μερικοι", "μετα", "μεταξυ", "μεχρι", "μη","μηδε", "μια", "μιαν",
      "μιας", "μολις", "μολονοτι", "μονη", "μονο", "μονολοτι", "μονος", "μου", "ν","να", "ξ", "ο",
      "οι", "ομως", "οποια", "οποιο", "οποιος", "οποιοσδηποτε", "οποτε", "οση", "οσο", "οσος",
      "οταν", "οτι", "οτιδηποτε", "ουδε", "ουτε", "π", "παρα", "περι", "πλην", "ποια", "ποιο",
      "ποιος","ποση", "ποσο", "ποσος", "που", "πριν", "προ", "προς", "προτου", "πως", "ρ", "σ",
      "σαν", "σας", "σε","σου", "στη", "στην", "στης", "στις", "στο", "στον", "στου", "στους",
      "στων", "συν", "τ", "τα", "τες","τετοια", "τετοιο", "τετοιος", "τη", "την", "της", "τι",
      "τιποτα", "τιποτε", "τις", "το", "τοι", "τον","τος", "τοση", "τοσο", "τοσος", "του", "τους",
      "τουτη", "τουτο", "τουτος", "των", "υ", "υπερ", "υπο","φ", "χ", "χαρη", "χαριν", "χωρις",
      "ψ", "ω", "ως", "ωσοτου", "ωσπου", "ωστε", "ωστοσο" };

    LinkedList<String> newWordList = new LinkedList<String>(Arrays.asList(input));

    for (Iterator<String> iter = newWordList.iterator(); iter.hasNext();) {
      String word = iter.next();
      for (int i = 0; i < stopwords.length; i++) {
        if (word.equals(stopwords[i])) {
          iter.remove();
        }
      }
    }
    
    String[] nwl = newWordList.toArray(new String[newWordList.size()]);
    return nwl;
  }
}
