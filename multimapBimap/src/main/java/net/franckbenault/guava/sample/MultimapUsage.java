package net.franckbenault.guava.sample;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class MultimapUsage {

	
	public static Multimap<String, Integer> getScores() {
		
		Multimap<String,Integer> scores = HashMultimap.create(); 
		
		return scores;
		
	}
}
