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
		

		CollectionUsage.colors.add("rod");
		CollectionUsage.colors.add("rod1");
		CollectionUsage.colors.add("rod2");
		CollectionUsage.colors.add("rod3");

		CollectionUsage.colors.add("rod4");
	}

}
