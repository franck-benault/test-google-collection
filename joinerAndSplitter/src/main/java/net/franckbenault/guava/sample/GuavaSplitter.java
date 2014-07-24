package net.franckbenault.guava.sample;


import com.google.common.base.Splitter;

public class GuavaSplitter {
	
	public static Iterable<String> simpleStringToInterator(String s) {
		
		return Splitter.on(",")
				.split(s);
		
	}

	
	public static Iterable<String> stringToInteratorWithTrim(String s) {
		
		return Splitter.on(",")
				.trimResults()
				.split(s);
		
	}
	
	public static Iterable<String> stringToInteratorRemoveEmpty(String s) {
		
		return Splitter.on(",")
				.omitEmptyStrings()
				.split(s);
		
	}
	
	public static Iterable<String> stringToInteratorWithLimit3(String s) {
		
		return Splitter.on(",")
				.limit(3)
				.split(s);
		
	}
}
