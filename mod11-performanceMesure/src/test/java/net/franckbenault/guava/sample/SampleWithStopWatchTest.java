package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleWithStopWatchTest {
	
	@Test(timeout=4000)
	public void testLongProcess() {
		long elapsedTime = SampleWithStopWatch.longProcess();
		assertTrue(elapsedTime>0);
		assertTrue(elapsedTime<3500);
	}

}
