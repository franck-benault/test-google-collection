package net.franckbenault.guava.sample;

import java.util.List;

public class JavaJoiner {
	
	public static String listToString(List<String> list) {
		
		if (list == null)
			throw new IllegalArgumentException("null list");
		
		final StringBuilder sb = new StringBuilder();
		boolean premier = true; 
		
		for(String item: list) {
			if(item==null) 
				continue;
				
			if(premier) {
				premier=false;
			} else {
				sb.append(",");
			}
			sb.append(item);
		}
		
		return sb.toString();
		
		
	}

}
