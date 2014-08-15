package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonQueriesTest {

	@Test
	public void testFindByName() {
		assertNotNull(PersonQueries.findByName("Sophie"));
		assertNull(PersonQueries.findByName("Sophi"));
	
	}

}
