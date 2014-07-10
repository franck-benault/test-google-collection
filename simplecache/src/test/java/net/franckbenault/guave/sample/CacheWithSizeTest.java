package net.franckbenault.guave.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class CacheWithSizeTest {


	@Test
	public void testCache() {

		CacheWithSize myCache = new CacheWithSize();
		
		assertEquals(myCache.cache.size(),0);
		String res = myCache.cache.getUnchecked("simple test");
		assertNotNull(res);
		assertEquals(myCache.cache.size(),1);
		
		for(int i=0 ; i<100; i++) {
			myCache.cache.getUnchecked("simple test"+i);
			assertTrue(myCache.cache.size()<=10);
		}
	}

}
