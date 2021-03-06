package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class CollectionUsageTest {

	@Test
	public void testObject() {
		assertNotNull(CollectionUsage.lookup);
		assertTrue(CollectionUsage.lookup.isEmpty());

		assertNotNull(CollectionUsage.lookup2);
		assertTrue(CollectionUsage.lookup2.isEmpty());
		
	}

	
	@Test(expected=UnsupportedOperationException.class)
	public void testImmutableMap() {
			
		
		CollectionUsage.codeColor.put("color", "myValue");
	}
}
