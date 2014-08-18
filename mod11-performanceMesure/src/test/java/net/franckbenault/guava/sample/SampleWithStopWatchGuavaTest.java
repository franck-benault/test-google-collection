package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleWithStopWatchGuavaTest {
	
	@Test(timeout=4000)
	public void testLongProcess() {
		long elapsedTime = SampleWithStopWatchGuava.longProcess();
		assertTrue(elapsedTime>0);
		assertTrue(elapsedTime<3500);
	}

}
