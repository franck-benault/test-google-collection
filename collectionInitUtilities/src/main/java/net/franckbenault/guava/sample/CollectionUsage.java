package net.franckbenault.guava.sample;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Maps;

public class CollectionUsage {

	
	//before java7
	public static final Map<String, Map<String,Integer>> lookup = Maps.newHashMap();
	
	//java7+
	public static final Map<String, Map<String,Integer>> lookup2 = new HashMap<>();
	
	
	
}
