package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_Append {

	public static void main(String[] args) {

		String location = "C:\\babu\\personal\\work\\2024_workspace\\CoreJava_Jan14_Mathew\\demo\\sample.txt";
		
		try {
			FileWriter fw = new FileWriter(location, true);
			
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("hi hello");
			pw.println(true);
			pw.println("learning java");
			
			pw.close();
			
			System.out.println("content appended to the existing file");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
