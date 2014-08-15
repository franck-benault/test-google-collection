package net.franckbenault.guave.sample;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class CacheWithSize {

	
	public CacheLoader<String,String> loader = new CacheLoader<String,String>() {
		public String load(String key) {
			return key.toUpperCase();
		}
	};

	public LoadingCache<String, String> cache = CacheBuilder.newBuilder()
			.maximumSize(10)
			.build(loader);
}
