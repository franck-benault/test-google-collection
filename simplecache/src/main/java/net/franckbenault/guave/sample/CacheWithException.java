package net.franckbenault.guave.sample;

import java.io.IOException;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class CacheWithException {

	
	public CacheLoader<String,String> loader = new CacheLoader<String,String>() {
		public String load(String key) throws IOException {
			if(key.startsWith("Exception"))
				throw new IOException("IOException");
			else
				return key.toUpperCase();
		}
	};

	public LoadingCache<String, String> cache = CacheBuilder.newBuilder().build(loader);
}
