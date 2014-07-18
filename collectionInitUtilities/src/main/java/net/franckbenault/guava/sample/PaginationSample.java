package net.franckbenault.guava.sample;

import java.util.List;

import com.google.common.collect.Lists;

public class PaginationSample {

	public static List<String> colors = Lists.newArrayList("red", "white", "black", "blue", "green", "yellow");
	
	
	public static List<List<String>> getPagination() {
		
		return Lists.partition(colors, 4);
	}
}
