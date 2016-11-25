import java.util.StringTokenizer;

public class StringToken {
	//create new object of class GetInput
	GetInput gi = new GetInput();
	//get the string that was imported from user in GetInput class calling the getTerm method.
	String str = gi.getTerm();
	StringTokenizer st = new StringTokenizer(str);
	/* Νομίζω πως πρέπει να το περάσουμε πρώτα από κλάση που κάνει stop word removal,
	 * και ενδεχωμένως και από άλλες κλάσεις και στο τέλος να το "σπάσουμε" με την StringToken.
	 * Ιδέες για την αποθήκευση του αποτελέσματος;
	 */
		while (st.hasMoreElements()){
			// delimiters(χαρακτήρες διαχωρισμού, κενό, τελεία, κόμμα κλπ)
		}
	}

