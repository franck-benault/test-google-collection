package net.franckbenault.guave.sample;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class SimpleCache {

	
	public CacheLoader<String,String> loader = new CacheLoader<String,String>() {
		public String load(String key) {
			return key.toUpperCase();
		}
	};

	public LoadingCache<String, String> cache = CacheBuilder.newBuilder().build(loader);
}
