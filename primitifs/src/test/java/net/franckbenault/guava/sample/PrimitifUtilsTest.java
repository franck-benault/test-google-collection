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
		//fail("Not yet implemented");
	}

}
