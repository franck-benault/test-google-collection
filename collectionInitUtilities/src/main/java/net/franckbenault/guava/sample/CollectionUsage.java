package net.franckbenault.guava.sample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;
import com.google.common.collect.Lists;


public class CollectionUsage {

	
	//before java7
	public static final Map<String, Map<String,Integer>> lookup = Maps.newHashMap();
	
	//java7+
	public static final Map<String, Map<String,Integer>> lookup2 = new HashMap<>();
	
	//init of List in one line
	List<String> rawbow = Lists.newArrayList("red", "white", "green", "black");
	
}
