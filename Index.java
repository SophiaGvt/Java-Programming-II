import java.net.URL;
import java.util.Map;
import java.util.Hashtable; 
import java.util.ArrayList;

public class Index {
	Map <String, ArrayList <URL>> sUrl;
	Map <String, ArrayList <int>> sTimes;
	
	public void createIndex () {//������� �� ������ �� ������ html
		 sUrl = new Hashtable <String, ArrayList <URL>>();
		 sTimes = new HashTable <String, ArrayList<int>>();
		
		//��� ������� ��� ������ �� �� split ��� �� ��� ���������� �� ������
		int times = 0;
		for (String token : tokens) {
			
			sUrl.put(token, URL);
			if (sUrl.containsKey(token)) {
				times++;
				sTimes.put(token, times);
										
			} else {
				sTimes.put(token, 1);
								
			}
		}
	
	
		
	}

}
