package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.common.collect.Iterables;

public class GuavaSplitterTest {

	@Test
	public void testSimpleStringToInterator() {
		
		Iterable<String> i = GuavaSplitter.simpleStringToInterator("one,two,three,four");
		assertEquals(Iterables.size(i),4);
		assertTrue(Iterables.contains(i,"one"));
	}

	@Test
	public void testStringToInteratorWithTrim() {
		
		Iterable<String> i = GuavaSplitter.stringToInteratorWithTrim(" one , two, three,four");
		assertEquals(Iterables.size(i),4);
		assertTrue(Iterables.contains(i,"one"));
	}
	
	@Test
	public void testStringRemoveEmpty() {
		
		Iterable<String> i = GuavaSplitter.stringToInteratorRemoveEmpty("one,,two,,three,four");
		assertEquals(Iterables.size(i),4);
		assertTrue(Iterables.contains(i,"one"));
	}
	
	@Test
	public void testStringToInteratorLimit3() {
		
		Iterable<String> i = GuavaSplitter.stringToInteratorWithLimit3("one,two,three,four");
		assertEquals(Iterables.size(i),3);
		assertTrue(Iterables.contains(i,"one"));
		assertTrue(Iterables.contains(i,"three,four"));
	}
	
}
