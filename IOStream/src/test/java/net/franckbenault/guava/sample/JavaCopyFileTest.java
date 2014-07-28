package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaCopyFileTest {

	@Test
	public void testCopieFile() {
		
		boolean res = JavaCopyFile.copieFile(".//src//test//resources//foo.txt", "target//foo.txt");
		assertTrue(res);
	}

}
