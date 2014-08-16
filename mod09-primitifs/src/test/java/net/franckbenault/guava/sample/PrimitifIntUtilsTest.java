package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PrimitifIntUtilsTest {

	@Test
	public void testInitListDouble() {
		List<Long> res = PrimitifLongUtils.initListDouble();
		
		assertNotNull(res);
		assertFalse(res.isEmpty());
		assertEquals(res.size(),5);
	}

	@Test
	public void testInitTabDouble() {
		long[] res = PrimitifLongUtils.initTabDouble();
		
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
