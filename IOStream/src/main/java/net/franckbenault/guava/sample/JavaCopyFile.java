package net.franckbenault.guava.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JavaCopyFile {

	
	public static boolean copieFile(String from, String to) {
		boolean ok = false;
		
		File fileFrom = new File(from);
		File fileTo = new File(to);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(fileFrom);
			fos = new FileOutputStream(fileTo);
			
			ok=true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return  ok;
	}
}
