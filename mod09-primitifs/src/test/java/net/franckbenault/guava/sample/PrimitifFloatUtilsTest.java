package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PrimitifFloatUtilsTest {

	@Test
	public void testInitList() {
		List<Float> res = PrimitifFloatUtils.initList();
		
		assertNotNull(res);
		assertFalse(res.isEmpty());
		assertEquals(res.size(),5);
	}

	@Test
	public void testInitTab() {
		float[] res = PrimitifFloatUtils.initTab();
		
		assertNotNull(res);
		assertEquals(res.length,5);
	}
	
	@Test
	public void testGetMin() {
		Float res = PrimitifFloatUtils.getMin();
	
		assertTrue(res==1.1f);
	}
	
	@Test
	public void testGetMax() {
		Float res = PrimitifFloatUtils.getMax();
	
		assertTrue(res==2.7f);
	}
	
	@Test
	public void testContains() {
		assertTrue(PrimitifFloatUtils.contains(1.1f));
		assertFalse(PrimitifFloatUtils.contains(1.2f));
	
	}

	@Test
	public void testIndexOf() {
		assertTrue(PrimitifFloatUtils.indexOf(1.1f)==0);
		assertTrue(PrimitifFloatUtils.indexOf(1.2f)==-1);
	
	}
}
