package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuavaCopyFileTest {

	@Test
	public void testCopieFile() {
		
		boolean res = GuavaCopyFile.copieFile(".//src//test//resources//foo.txt", "target//foo.txt");
		assertTrue(res);
	}

	@Test
	public void testCopieFileNotOk() {
		
		boolean res = GuavaCopyFile.copieFile(".doesnotexist", "target//foo.txt");
		assertFalse(res);
	}
}
