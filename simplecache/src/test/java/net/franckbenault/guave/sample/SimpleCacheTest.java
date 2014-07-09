package net.franckbenault.guave.sample;

import static org.junit.Assert.*;

import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class SimpleCacheTest {

	@Test
	public void testCache() {

		assertEquals(SimpleCache.cache.size(),0);
		String res = SimpleCache.cache.getUnchecked("simple test");
		assertNotNull(res);
		assertEquals(SimpleCache.cache.size(),1);
	}

}
