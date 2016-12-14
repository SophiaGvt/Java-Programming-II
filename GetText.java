import java.util.regex.*;
import java.io.*;

public class GetText {
	public static void main(String args[]) {
		File file = new File("C:\\Users\\emalliari\\Desktop\\" + "nba-power-rankings-marc-stein-week-8-rankings.htm");
		Pattern cre = null;        // Compiled RE
        try {
            cre = Pattern.compile("strong");
        } catch (PatternSyntaxException e) {
            System.err.println("Invalid RE syntax: " + e.getDescription());

        }

        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            System.err.println("Unable to open file " + ": " + e.getMessage());

        }

        try {
            String s;
            while ((s = in.readLine()) != null) {
                Matcher m = cre.matcher(s);
                if (m.find())
                    System.out.println(s);
            }
        } catch (Exception e) {
            System.err.println("Error reading line: " + e.getMessage());

        }
    }
}
