package files;

import java.io.File;

public class FoldersDemo {

	public static void main(String[] args) {

		String location = "C:\\babu\\personal\\work\\2024_workspace\\CoreJava_Jan14_Mathew\\demo\\JAVA_EXAMPLES";
		
		File fileObj = new File(location);
		
		System.out.println("is new folder created or not "+fileObj.mkdir());
		
		System.out.println("is location pointed to folder or not "+fileObj.isDirectory());
		
		//System.out.println("is folder deleted or not "+fileObj.delete());
		
	}

}
