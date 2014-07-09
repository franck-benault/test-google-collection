package net.franckbenault.guave.sample;

import static org.junit.Assert.*;

import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class SimpleCacheTest {

	@Test
	public void testCache() throws ExecutionException {


		String res = SimpleCache.cache.get("simple test");
		assertNotNull(res);
	}

}
