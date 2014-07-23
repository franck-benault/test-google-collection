package net.franckbenault.guava.sample;

import java.util.List;

import com.google.common.base.Joiner;

public class GuavaJoiner {
	
	public static String listToString(List<String> list) {
		
		if (list == null)
			throw new IllegalArgumentException("null list");
		
		return Joiner.on(",").skipNulls().join(list);
		
	}

}
