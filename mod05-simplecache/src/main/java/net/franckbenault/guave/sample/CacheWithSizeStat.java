package net.franckbenault.guave.sample;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class CacheWithSizeStat {
	
	public CacheWithSizeStat(int size) {
		cache = CacheBuilder.newBuilder()
				.maximumSize(size)
				.recordStats()
				.build(loader);
	}

	
	public CacheLoader<String,String> loader = new CacheLoader<String,String>() {
		public String load(String key) {
			return key.toUpperCase();
		}
	};

	public LoadingCache<String, String> cache;
}
