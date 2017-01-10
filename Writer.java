import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 * ����� � ����� ������ �� map �� ������ �� ���������� �����
 * �� ��� ����� ����-http://example1,10;http://example2,20;
 * ���� ������ ����� � ���� ��� ���������� ��� map �� ��� ���� ���
 * @author amitsa
 *
 */
public class Writer {
	
	public static void writeIndexToFile(
			Map<String, ArrayList<Posting<String, Integer>>> myMap) {
		//path ��� ����� ������������ �� ������ ���� ���������� ���
		String path = "C:\\Users\\amitsa\\Desktop\\java_programming_2\\Search Engine\\myIndex.txt";
		File myIndex = new File(path);
		
		
		
		
		
		Sorting.sortedMap(myMap);//����� ��� Sorting ��� ���������� �� ���������� �����
		ArrayList<Posting<String, Integer>> myPostingList;
		FileWriter output = null;
		try {
			 output = new FileWriter(myIndex);
		} catch (IOException e) {
			
			e.printStackTrace();
		}//��� ��� �� ������������ key ��� map
		for (String key : Sorting.sortedKeys) {
			
			
			
			try {
				output.write(String.format("%s-", key));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
			
			myPostingList = myMap.get(key);//���� ��� �����-�� arraylist �� �� posting			
			for(Posting<String,Integer> myPosting : myPostingList) {//��� ���� �������� ��� arraylist ��� ���� ����� �����:
					
					try {
						output.write(String.format("%s,%d;",  myPosting.getUrl(), myPosting.getI() ));
					} catch (IOException e) {
						
						e.printStackTrace();
					}
			}
			try {
				output.write("\r\n");//��������� ��� ���� ����� ��� ��� ������� ����(���������� ���� restoreIndex ���� �������� �� ������ ������ ������)
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		try {//�������� ��� �������
			output.flush();
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
