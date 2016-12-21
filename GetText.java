import java.util.regex.*;
import java.io.*;

public class GetText {
	public static void main(String args[]) {
		File file = new File("C:\\Users\\emalliari\\Desktop\\Basketball.htm");
		Pattern cre = null;        // Compiled RE
        try {
        	cre = Pattern.compile("<p>");

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
            	//System.out.println(s); 
                Matcher m = cre.matcher(s);

                s = s.replaceAll("<p>","");
                s = s.replaceAll("</p>","");
                s = s.replaceAll("<a href=.*?>", "");
                s = s.replaceAll("</a>","");
                s = s.replaceAll("<b>","");
                s = s.replaceAll("</b>","");
                s = s.replaceAll("<sup.*?</sup>", "");
                s = s.replaceAll("–","");
                s = s.replaceAll("&#.*;","");
                s = s.replaceAll("<i>","");
                s = s.replaceAll("</i>","");
                s = s.replaceAll("<span>.*?</span>","");
                
                
                //System.out.println(s);
                if (m.find()){
                    System.out.println(s);
                    //System.exit(1);
                }
            }
        } catch (Exception e) {
            System.err.println("Error reading line: " + e.getMessage());

        }
    }
}
