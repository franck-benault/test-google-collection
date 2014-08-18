package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CacheWithGuavaTest {
	
	private static CacheWithGuava cache = new CacheWithGuava();

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cache.getAge(CacheWithMap.SYLVIE);
	}


	@Test(timeout=10)
	public void testGetAge_inCache() {
		Integer res =cache.getAge(CacheWithMap.SYLVIE);
		assertTrue(res>0);
	}

	@Test(timeout=1010)
	public void testGetAge_outCache() {
		Integer res =cache.getAge(CacheWithMap.RUTH);
		assertTrue(res>0);
	}
	
	@Test(timeout=1100)
	public void testGetWithSlowRequest() {
		Integer res =cache.getWithSlowRequest(CacheWithMap.SYLVIE);
		assertTrue(res>0);
	}

}
