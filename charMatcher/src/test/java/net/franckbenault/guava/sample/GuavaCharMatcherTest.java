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
	public void testWithoutCharacter() {
		
		String res = GuavaCharMatcher.withoutCharacter("aZas34r");
		assertNotNull(res);
		assertEquals(res, "34");

	}

	@Test
	public void testWithoutASCII() {
		String res = GuavaCharMatcher.withoutASCII("aÈZas‡4r");
		assertNotNull(res);
		assertEquals(res, "È‡");
	}

}
