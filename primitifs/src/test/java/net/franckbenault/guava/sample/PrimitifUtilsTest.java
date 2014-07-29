package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PrimitifUtilsTest {

	@Test
	public void testInitListDouble() {
		List<Double> res = PrimitifUtils.initListDouble();
		
		assertNotNull(res);
		assertFalse(res.isEmpty());
		assertEquals(res.size(),5);
	}

	@Test
	public void testInitTabDouble() {
		double[] res = PrimitifUtils.initTabDouble();
		
		assertNotNull(res);
		assertEquals(res.length,5);
	}
	
	@Test
	public void testGetMin() {
		double res = PrimitifUtils.getMin();
	
		assertTrue(res==1.1);
	}
	
	@Test
	public void testGetMax() {
		double res = PrimitifUtils.getMax();
	
		assertTrue(res==2.7);
	}
	
	
	@Test
	public void testContains() {
		assertTrue(PrimitifUtils.contains(1.1));
		assertFalse(PrimitifUtils.contains(1.2));
	
	}

}
