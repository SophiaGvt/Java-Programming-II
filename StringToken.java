import java.util.StringTokenizer;

public class StringToken {
	//create new object of class GetInput
	GetInput gi = new GetInput();
	//get the string that was imported from user in GetInput class calling the getTerm method.
	String str = gi.getTerm();
	StringTokenizer st = new StringTokenizer(str);
	/* ������ ��� ������ �� �� ��������� ����� ��� ����� ��� ����� stop word removal,
	 * ��� ����������� ��� ��� ����� ������� ��� ��� ����� �� �� "��������" �� ��� StringToken.
	 * ����� ��� ��� ���������� ��� �������������;
	 */
		while (st.hasMoreElements()){
			// delimiters(���������� �����������, ����, ������, ����� ���)
		}
	}

