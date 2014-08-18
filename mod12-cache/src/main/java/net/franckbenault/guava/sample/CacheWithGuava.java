package net.franckbenault.guava.sample;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class CacheWithGuava {
	
	public static String SYLVIE = "Sylvie";
	public static String RUTH = "Ruth";
	private LoadingCache<String, Integer> ages;
	
	public CacheWithGuava() {
		
		ages = CacheBuilder.newBuilder().build(new CacheLoader<String, Integer>() {
			public Integer load(String prenom) {
				return getWithSlowRequest(prenom);
			}
		});
	}
	
	public Integer getAge(String prenom) {
		
		Integer age = ages.getUnchecked(prenom);
		return age;
	}
	
	public Integer getWithSlowRequest(String prenom) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(prenom.equals(RUTH))
			return 24;
		else if(prenom.equals(SYLVIE))
			return 26;
		else
			return 34;
	}
}
