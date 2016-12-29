package searchengine;

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
  *  Method that removes stop words from String[].
  * @param input : String[] to remove stop words from
  * @return nwl (String[] without stop words)
  */
  public static String[] removeStopWords(String[] input) {

    final String[] stopwords = { "a", "about", "above", "across", "after", "ago", "although", "an",
      "and", "as","at", "b", "because", "before", "below", "beside", "but", "by", "c", "d", "e",
      "f", "for", "from", "g","h", "he", "her", "hers", "herself", "him", "himself", "his", "i",
      "in", "into", "it", "its", "itself","j", "k", "l", "m", "me", "mine", "myself", "n", "not",
      "o", "of", "off", "on", "onto", "or", "ours","ourselves", "over", "p", "past", "q", "r", "s",
      "she", "since", "so", "t", "the", "theirs", "them","themselves", "they", "through", "till",
      "to", "towards", "u", "under", "unless", "until", "us", "v","w", "we", "whereas", "while",
      "x", "y", "yet", "you", "yours", "yourselves", "youself", "z", "�","����", "�����", "���",
      "����", "��", "���", "����", "����", "���", "���", "����", "�����", "����","�����", "�����",
      "����", "�����", "�����", "�����", "�����", "������", "�����", "������", "����", "�","�",
      "���", "�����", "�", "������", "���", "�����", "�", "���", "���", "���", "����", "��", 
      "������","������", "�������", "�����", "����", "�����", "�����", "��", "���", "����",
      "��������", "����","�����", "����", "�����", "���", "��������", "������", "���", "��������",
      "����", "�����", "�����","���", "������", "������", "�������", "���", "�", "�", "�", "�",
      "�����", "�", "����", "�������","������", "�������", "������", "�����", "���", "�����",
      "�������", "�������", "��������", "������","������", "�������", "������", "������",
      "�������", "����", "����", "������", "��", "�", "����","������", "�", "��", "���", "��",
      "������", "�������", "�������", "����", "������", "�����", "��","����", "���", "����",
      "����", "�����", "��������", "����", "����", "��������", "�����", "���", "�","��", "�", "�",
      "��", "����", "�����", "�����", "������", "������������", "�����", "���", "���", "����",
      "����", "���", "���������", "����", "����", "�", "����", "����", "����", "����", "����",
      "�����","����", "����", "�����", "���", "����", "���", "����", "������", "���", "�", "�",
      "���", "���", "��","���", "���", "����", "����", "����", "���", "����", "����", "�����",
      "����", "���", "�", "��", "���","������", "������", "�������", "��", "���", "���", "��",
      "������", "������", "���", "��", "���", "���","���", "����", "����", "�����", "���", "����",
      "�����", "�����", "������", "���", "�", "����", "���","�", "�", "����", "�����", "�����",
      "�", "�", "��", "������", "�����", "����", "������" };

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
