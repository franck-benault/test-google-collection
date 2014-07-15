package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class CollectionUsageTest {

	@Test
	public void testObject() {
		assertNotNull(CollectionUsage.lookup);
		assertTrue(CollectionUsage.lookup.isEmpty());
	}

}
