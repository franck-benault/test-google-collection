package net.franckbenault.guava.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
			
			byte buffer[] = new byte[512*1024];
			int nb; 
			while((nb= fis.read(buffer))!=-1) {
				fos.write(buffer,0,nb);
			}
			
			ok=true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		return  ok;
	}
}
