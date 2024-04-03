package files;

import java.io.File;
import java.io.IOException;

public class FileMethodsDemo {

	public static void main(String[] args) {

		String location = "C:\\babu\\personal\\work\\2024_workspace\\CoreJava_Jan14_Mathew\\demo\\sample.txt";
		
		File fileObj = new File(location);
		
		System.out.println("is file existing or not "+fileObj.exists());
		
		try {
			boolean result = fileObj.createNewFile();
			System.out.println("is new file created or not "+result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("is location pointed to file or not "+fileObj.isFile());
		
		System.out.println("no of characters present in file are "+fileObj.length());
		
	//	System.out.println("is file deleted or not "+fileObj.delete());
		
	}

}
