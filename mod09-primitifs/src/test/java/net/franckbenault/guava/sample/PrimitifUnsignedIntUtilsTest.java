package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.google.common.primitives.UnsignedInteger;

public class PrimitifUnsignedIntUtilsTest {


	
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
	
}
