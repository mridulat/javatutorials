package org.apex.main;

import java.util.*;
import java.io.*;
import java.lang.*;

public class ReadFile {

	private Scanner x;
	private String string;

	public void reading() {
		try {
			x = new Scanner(new File("C:\\Users\\Mridula\\Documents\\Java\\readme.txt"));
		} 
		catch (Exception e) {
			System.out.println("File doesn't exist");
		}
		
		x.useDelimiter("\\Z");
		
		string = x.next();		
		
	}

	public void freqCount() {

		string=string.replace(" ","");

		while(string.length()>0) {
			char c = string.charAt(0);
			System.out.println(c +"\t"+ countChar(string,c));
			string= string.replace(""+c, "");
		}
		
	}
	
	public int countChar(String string, char c) {
		int count = 0;
		
	while(string.indexOf(c)!= -1) {
		count++;
		string = string.substring(string.indexOf(c)+1);
	}
		return count;
	}
}

