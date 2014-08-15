package net.franckbenault.guava.sample;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.junit.Test;

public class FileManagerTest {

	@Test
	public void testWriteAllText() throws FileNotFoundException, IOException {

	
        File file = new File("target\\foo");
		
		//FileManager.writeAllText(file, "my content");
	}

}
