package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PrimitifIntUtilsTest {

	@Test
	public void testInitList() {
		List<Integer> res = PrimitifIntUtils.initList();
		
		assertNotNull(res);
		assertFalse(res.isEmpty());
		assertEquals(res.size(),5);
	}

	@Test
	public void testInitTab() {
		int[] res = PrimitifIntUtils.initTab();
		
		assertNotNull(res);
		assertEquals(res.length,5);
	}
	
	@Test
	public void testGetMin() {
		long res = PrimitifIntUtils.getMin();
	
		assertTrue(res==-2);
	}
	
	@Test
	public void testGetMax() {
		long res = PrimitifIntUtils.getMax();
	
		assertTrue(res==7);
	}
	
	@Test
	public void testContains() {
		assertTrue(PrimitifIntUtils.contains(-2));
		assertFalse(PrimitifIntUtils.contains(8));
	
	}

	@Test
	public void testIndexOf() {
		assertTrue(PrimitifIntUtils.indexOf(-1)==0);
		assertTrue(PrimitifIntUtils.indexOf(8)==-1);
	
	}
}
