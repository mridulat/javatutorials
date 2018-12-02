package org.apex.main;

import java.io.*;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  String fileName = "Temp.text";
		String line = null;
		
		try {
			FileReader fileReader = new FileReader("C:\\Users\\Mridula\\Documents\\Java\\Temp.txt");
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while ((line =bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		
			bufferedReader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File doesn't exist");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}

}
