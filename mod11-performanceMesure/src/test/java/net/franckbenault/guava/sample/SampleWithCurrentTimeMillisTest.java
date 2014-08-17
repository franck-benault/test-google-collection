package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleWithCurrentTimeMillisTest {
	
	@Test(timeout=4000)
	public void testLongProcess() {
		long elapsedTime = SampleWithCurrentTimeMillis.longProcess();
		assertTrue(elapsedTime>0);
		assertTrue(elapsedTime<3500);
	}

}
