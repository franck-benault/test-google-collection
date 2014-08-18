package net.franckbenault.guava.sample;

import java.util.HashMap;
import java.util.Map;

public class CacheWithMap {
	
	public static String SYLVIE = "Sylvie";
	public static String RUTH = "Ruth";
	private Map<String, Integer> ages;
	
	public CacheWithMap() {
		
		ages = new HashMap<String, Integer>();
	}
	
	public Integer getAge(String prenom) {
		
		Integer age = ages.get(prenom);
		if(age==null) {
			age = getWithSlowRequest(prenom);
			ages.put(prenom, age);
			
		}
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
