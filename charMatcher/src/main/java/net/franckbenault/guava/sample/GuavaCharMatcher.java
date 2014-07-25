package net.franckbenault.guava.sample;

import com.google.common.base.CharMatcher;

public class GuavaCharMatcher {

	
	public static String withoutFigure(String input) {
		
		return CharMatcher.DIGIT.removeFrom(input);
	}

	public static int countFigure(String input) {
		
		return CharMatcher.DIGIT.countIn(input);
	}
	
	public static String withoutCharacter(String input) {
		return CharMatcher.JAVA_LETTER.removeFrom(input);
		
	}

	public static int countCharacter(String input) {
		return CharMatcher.JAVA_LETTER.countIn(input);
		
	}
	
	public static String withoutASCII(String input) {
		return CharMatcher.ASCII.removeFrom(input);
	}
	
	public static int countASCII(String input) {
		return CharMatcher.ASCII.countIn(input);
	}
	
}
