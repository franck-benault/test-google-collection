package net.franckbenault.guava.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.google.common.io.ByteStreams;
import com.google.common.io.Closeables;

public class GuavaCopyFile {

	
	public static boolean copieFile(String from, String to) {
		boolean ok = false;
		
		File fileFrom = new File(from);
		File fileTo = new File(to);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(fileFrom);
			fos = new FileOutputStream(fileTo);
			
			ByteStreams.copy(fis, fos);
			ok=true;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				Closeables.close(fis,  !ok);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				Closeables.close(fos,  !ok);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		return  ok;
	}
}
