package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class SetUsageTest {

	@Test
	public void testGetMult6View() {
		SetUsage setUsage = new SetUsage();
		
		Set<Integer> mult6 = setUsage.getMult6View();
		assertNotNull(mult6);
		assertEquals(mult6.size(),2);
		
		try {
			mult6.add(33);
			fail("exception excepted");
		} catch ( UnsupportedOperationException e) {
			//ok
		}
		
	}

	
	@Test
	public void testGetMult2Or3View() {
		SetUsage setUsage = new SetUsage();
		
		Set<Integer> mult2Or3 = setUsage.getMult2Or3View();
		assertNotNull(mult2Or3);
		assertEquals(mult2Or3.size(),8);
		
		//this a view, you are not allowed to add something
		try {
			mult2Or3.add(33);
			fail("exception excepted");
		} catch ( UnsupportedOperationException e) {
			//ok
		}
		
	}
}
