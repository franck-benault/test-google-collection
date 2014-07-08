package net.franckbenault.guava.sample;

import com.google.common.base.Splitter;

public class VerySimpleExample {

	
	public static String[] splitJava(String input) {
		return input.split(",");
	}
	
	public static Iterable<String> splitGuava(String input) {
		return Splitter.on(',')
				.trimResults()
				.omitEmptyStrings()
				.split(input);
	}
}
