package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionsDemo {

	public static void main(String[] args) {

		String location = "C:\\babu\\personal\\work\\2024_workspace\\CoreJava_Jan14_Mathew\\demo\\client.txt";
		
		File fileObj = new File(location);
		
				try {
					fileObj.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		System.out.println("end of main method");
		
	}

}
