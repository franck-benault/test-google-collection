package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmsSampleTest {

	@Test
	public void testconvertToIntermediateFileContent() {
		SmsSample sample = new SmsSample();
		
		System.out.println(sample.convertToIntermediateFileContent());
	}

}
