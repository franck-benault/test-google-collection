package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.Iterator;


import org.junit.Test;

public class VerySimpleExampleTest {

	@Test
	public void testSplitJava() {
		String[] output =VerySimpleExample.splitJava(" foo, ,bar, quux,");
		System.out.println(output);
				
		assertEquals(" foo",output[0]);		
		assertEquals(output.length,4);
	}

	@Test
	public void testSplitGuava() {
		Iterable<String> output =VerySimpleExample.splitGuava(" foo, ,bar, quux,");
		System.out.println(output);
		
		Iterator<String> iterator = output.iterator();
		assertEquals("foo",iterator.next());
		
	
	}

}
