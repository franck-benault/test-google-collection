package net.franckbenault.guave.sample;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.common.cache.CacheStats;

public class CacheWithSizeStatTest {


	private int random10() {
		return (int)(Math.random() *10);
	}
	
	@Test
	public void testCache() {

		CacheWithSizeStat myCache = new CacheWithSizeStat(9);
		
	
		
		for(int i=0 ; i<1000; i++) {
			myCache.cache.getUnchecked("simple test"+random10());
		}
		
		CacheStats stats = myCache.cache.stats();

		
		System.out.println("hit "+stats.hitCount());
		System.out.println("miss "+stats.missCount());
	}

}
