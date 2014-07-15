package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class SetUsageTest {

	@Test
	public void testGetMult6() {
		SetUsage setUsage = new SetUsage();
		
		Set<Integer> mult6 = setUsage.getMult6();
		assertNotNull(mult6);
		assertEquals(mult6.size(),2);
	}

}
