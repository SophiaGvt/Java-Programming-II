package javengers;

import java.util.regex.*;
import java.io.*;

public class GetText {
	
	   public String getText(String path) {
		File file = new File(path);
		Pattern cre1 = null;

		try {
			cre1 = Pattern.compile("<p>|<title>.*?</title>|<br />");

		} catch (PatternSyntaxException e) {
			System.err.println("Invalid RE syntax: " + e.getDescription());

		}

		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream(
					file)));
		} catch (FileNotFoundException e) {
			System.err.println("Unable to open file " + ": " + e.getMessage());

		}
		String sumLine = "";
		String line = "";
		try {
			
			while ((line = in.readLine()) != null) {

				Matcher m1 = cre1.matcher(line);

				line = line.replaceAll("β€.", "");
				line = line.replaceAll("&.*?;", "");
				line = line.replaceAll("<script.*(</script>)?", " ");
				line = line.replaceAll("<.*?>", " ");
				line = line.replaceAll("\\[[0-9]{1,2}\\]", "");
				line = line.replaceAll("\"", "");

				if (m1.find()) {
					sumLine += line;
				}
			}
			 
		} catch (Exception e) {
			System.err.println("Error reading line: " + e.getMessage());

		}
		
		try {
		in.close();
		
		} catch (IOException e) {
			System.err.println("Error closing file: " + e.getMessage());
		}
		
		return sumLine;
	}
}
