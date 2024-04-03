package files;

import java.io.File;

public class ListDemo {

	public static void main(String[] args) {

		String location = "C:\\babu\\personal\\work\\2024_workspace\\CoreJava_Jan14_Mathew\\";
		
		File fileObj = new File(location);
		
		String[] names = fileObj.list();
		
		for(String name : names) {
				System.out.println(name);
		}
		
	}

}
