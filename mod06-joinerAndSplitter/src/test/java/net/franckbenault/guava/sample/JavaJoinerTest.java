package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JavaJoinerTest {

	@Test(expected=IllegalArgumentException.class)
	public void testListToStringException() {
		JavaJoiner.listToString(null);
	}

	@Test
	public void testListToStringEmptyList() {
		List<String> list = new ArrayList<String>();
		String res= JavaJoiner.listToString(list);
		assertEquals(res,"");
	}

	@Test
	public void testListToStringOneElement() {
		List<String> list = new ArrayList<String>();
		list.add("one");
		String res= JavaJoiner.listToString(list);
		assertEquals(res,"one");
	}
	
	
	@Test
	public void testListToStringtwoElements() {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		String res= JavaJoiner.listToString(list);
		assertEquals(res,"one,two");
	}

	@Test
	public void testListToStringWithNull() {
		List<String> list = new ArrayList<String>();
		list.add(null);
		list.add("one");
		list.add("two");
		list.add(null);
		String res= JavaJoiner.listToString(list);
		assertEquals(res,"one,two");
	}
	
}
