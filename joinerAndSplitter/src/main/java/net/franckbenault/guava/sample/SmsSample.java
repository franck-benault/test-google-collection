package net.franckbenault.guava.sample;

import java.util.List;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

public class SmsSample {
	
	public String convertToIntermediateFileContent() {
		
		List<String> fields = Lists.newArrayList(null,"one", null, "three", "four", null);
		
		String res = Joiner.on(":")	
			//.useForNull("")
			.appendTo(new StringBuilder(),Lists.transform(fields,new Function<String, String>() {
				public String apply(String input) {
					return bcpsybaseLike(input);
				}
			})).toString();

		return res;
	}

		
		public String bcpsybaseLike(String input) {

			if (input==null)
				return "";
			
			int i;
			for (i = input.length() - 1; i > 0; i--) {
				char c = input.charAt(i);
				if (c != '\u0020') {
					break;
				}
			}
			return input.substring(0, i + 1);
		}	
}
