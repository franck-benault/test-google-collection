package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuavaCharMatcherTest {

	@Test
	public void testWithoutFigure() {
		String res = GuavaCharMatcher.withoutFigure("aZas34r");
		assertNotNull(res);
		assertEquals(res, "aZasr");
	}

	@Test
	public void testCountFigure() {
		int res = GuavaCharMatcher.countFigure("aZas34r");
		assertEquals(res, 2);
	}
	
	@Test
	public void testReplaceFigure() {
		String res = GuavaCharMatcher.replaceFigure("aZas34r", "*");
		assertEquals(res, "aZas**r");
	}

	@Test
	public void testIndexFigure() {
		int res = GuavaCharMatcher.indexFigure("aZas34r");
		assertEquals(res, 4);
	}
	
	
	@Test
	public void testWithoutCharacter() {
		
		String res = GuavaCharMatcher.withoutCharacter("aZas34r");
		assertNotNull(res);
		assertEquals(res, "34");

	}

	
	@Test
	public void testCountCharacter() {
		
		int res = GuavaCharMatcher.countCharacter("aZas34r");
		assertEquals(res, 5);

	}
	
	@Test
	public void testWithoutASCII() {
		String res = GuavaCharMatcher.withoutASCII("aÈZas‡4r");
		assertNotNull(res);
		assertEquals(res, "È‡");
	}
	
	@Test
	public void testCountASCII() {
		int res = GuavaCharMatcher.countASCII("aÈZas‡4r");
		assertEquals(res, 6);
	}
	
	
	@Test
	public void testWithoutFigureAndUpperCase() {
		String res = GuavaCharMatcher.withoutFigureAndUpperCase("AÈZas‡4r");
		assertNotNull(res);
		assertEquals(res, "Èas‡r");
	}
	
	@Test
	public void testCountFigureUpperCase() {
		int res = GuavaCharMatcher.countFigureAndUpperCase("AÈZas‡4r");
		assertEquals(res, 3);
	}
}
