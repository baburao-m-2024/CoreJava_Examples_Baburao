package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) {

		System.out.println("Startig of main method");
		
		String location = "C:\\babu\\personal\\work\\2024_workspace\\CoreJava_Jan14_Mathew\\demo\\client.txt";
		
			try {
				createFile(location);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		System.out.println("Ending of main method");
	}
	
	static void createFile(String location) throws IOException {
		
		File fileObj = new File(location);
		
		fileObj.createNewFile();
		
	}

}
