package exceptionHandling;

import java.io.IOException;

public class ThrowsDemo2 {

	public static void main(String[] args) {

		String location = "C:\\babu\\personal\\work\\2024_workspace\\CoreJava_Jan14_Mathew\\demo\\client_3.txt";
		
		try {
			ThrowsDemo.createFile(location);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
