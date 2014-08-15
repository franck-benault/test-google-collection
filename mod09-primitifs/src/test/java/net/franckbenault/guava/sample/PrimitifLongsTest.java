package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PrimitifLongsTest {

	@Test
	public void testInitListDouble() {
		List<Double> res = PrimitifDoubleUtils.initListDouble();
		
		assertNotNull(res);
		assertFalse(res.isEmpty());
		assertEquals(res.size(),5);
	}

	@Test
	public void testInitTabDouble() {
		double[] res = PrimitifDoubleUtils.initTabDouble();
		
		assertNotNull(res);
		assertEquals(res.length,5);
	}
	
	@Test
	public void testGetMin() {
		double res = PrimitifDoubleUtils.getMin();
	
		assertTrue(res==1.1);
	}
	
	@Test
	public void testGetMax() {
		double res = PrimitifDoubleUtils.getMax();
	
		assertTrue(res==2.7);
	}
	
	@Test
	public void testContains() {
		assertTrue(PrimitifDoubleUtils.contains(1.1));
		assertFalse(PrimitifDoubleUtils.contains(1.2));
	
	}

	@Test
	public void testIndexOf() {
		assertTrue(PrimitifDoubleUtils.indexOf(1.1)==0);
		assertTrue(PrimitifDoubleUtils.indexOf(1.2)==-1);
	
	}
}
