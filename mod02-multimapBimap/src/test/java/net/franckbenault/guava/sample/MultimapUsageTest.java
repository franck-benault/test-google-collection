package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

import com.google.common.collect.Multimap;

public class MultimapUsageTest {

	@Test
	public void test() {
		
		Multimap<String,Integer> scores = MultimapUsage.getScores();
		assertNotNull(scores);
		assertEquals(scores.size(),3);
		assertTrue(Collections.max(scores.get("Bob"))==20);
		
	}

}
