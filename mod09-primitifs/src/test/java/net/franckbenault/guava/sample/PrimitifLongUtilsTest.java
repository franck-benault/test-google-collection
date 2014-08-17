package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PrimitifLongUtilsTest {

	@Test
	public void testInitListLong() {
		List<Long> res = PrimitifLongUtils.initList();
		
		assertNotNull(res);
		assertFalse(res.isEmpty());
		assertEquals(res.size(),5);
	}

	@Test
	public void testInitTabLong() {
		long[] res = PrimitifLongUtils.initTab();
		
		assertNotNull(res);
		assertEquals(res.length,5);
	}
	
	@Test
	public void testGetMin() {
		long res = PrimitifLongUtils.getMin();
	
		assertTrue(res==-2);
	}
	
	@Test
	public void testGetMax() {
		long res = PrimitifLongUtils.getMax();
	
		assertTrue(res==7);
	}
	
	@Test
	public void testContains() {
		assertTrue(PrimitifLongUtils.contains(-2));
		assertFalse(PrimitifLongUtils.contains(8));
	
	}

	@Test
	public void testIndexOf() {
		assertTrue(PrimitifLongUtils.indexOf(-1)==0);
		assertTrue(PrimitifLongUtils.indexOf(8)==-1);
	
	}
}
