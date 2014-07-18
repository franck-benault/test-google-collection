package net.franckbenault.guava.sample;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class ImmutableSample {

	
	public List<String> colors = Lists.newArrayList("red", "white", "black", "blue", "green", "yellow");
	
	
	public List<String> getJavaImmutable() {
		
		return Collections.unmodifiableList(colors);
	}
	
	public List<String> getGuavaImmutable() {
		
		return ImmutableList.copyOf(colors);
	}
}
