package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {

		String location = "C:\\babu\\personal\\work\\2024_workspace\\CoreJava_Jan14_Mathew\\demo\\sample.txt";
		
		File fileObj = new File(location);
		
		try {
			FileReader fReader = new FileReader(fileObj);
			BufferedReader buffReader = new BufferedReader(fReader);
			
			String line = "";
			
			while( (line = buffReader.readLine()) != null ) {
				 System.out.println(line);
			}
			
			buffReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}

