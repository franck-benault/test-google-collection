package net.franckbenault.guave.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCacheTest {


	@Test
	public void testCache() {

		SimpleCache simpleCache = new SimpleCache();
		
		assertEquals(simpleCache.cache.size(),0);
		String res = simpleCache.cache.getUnchecked("simple test");
		assertNotNull(res);
		assertEquals(simpleCache.cache.size(),1);
	}

}
