package searchEngine;

import java.io.*;
import java.util.*;

public class StateMachine {
	try {
		FileInputStream a = new FileInputStream("");
		InputStreamReader filehtml = new  InputStreamReader(a, "");
	} 
	catch (FileNotFoundException e) {
		System.err.println("Unable to open file ");
		System.exit(1);
	}
	public void inTag() {
		do {
			int p = filehtml.read();
			if (p == '"') {
				inQuotes();
			}
		} while (p != '>');
	}

	private void inQuotes() {
		do {
			int p = filehtml.read();
		} while (p != '"');
		
	}
}
