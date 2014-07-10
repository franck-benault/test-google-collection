package net.franckbenault.guave.sample;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class CacheWithExceptionTest {


	@Test
	public void testCache() {

		CacheWithException myCache = new CacheWithException();
		
		assertEquals(myCache.cache.size(),0);
		String res = null;
		try {
			res = myCache.cache.get("simple test");
		} catch (ExecutionException e) {
			fail("no exception expected here");
		}
		assertNotNull(res);
		assertEquals(myCache.cache.size(),1);

		try {
			res = myCache.cache.get("Exception");
			fail("exception expected");
		} catch (ExecutionException e) {
			assertTrue(e.getCause() instanceof IOException);
		}
	}

}
