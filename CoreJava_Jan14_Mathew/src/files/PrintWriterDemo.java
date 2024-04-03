package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {

		String location = "C:\\babu\\personal\\work\\2024_workspace\\CoreJava_Jan14_Mathew\\demo\\sample.txt";
		
		File fileObj = new File(location);
		
		try {
			PrintWriter pwObj = new PrintWriter(fileObj);
			
			pwObj.println("hi my name is babu");
			pwObj.println(120);
			pwObj.println(90.45);
			pwObj.println(true);
			
			pwObj.close();
			
			System.out.println("content written to file successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
