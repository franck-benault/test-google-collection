package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ImmutableSampleTest {

	@Test
	public void testGetJavaImmutable() {
		ImmutableSample sample = new ImmutableSample();
		List<String> immutable = sample.getJavaImmutable();
		assertEquals(immutable.size(),6);

		try {
			immutable.add("new color");
			fail("exception expected");
		} catch (Exception e) {
			//ok
		}

		//immutable is in fact a view of the initial list
		//if the initial list changes
		//the view changes
		sample.colors.add("new color");
		assertEquals(immutable.size(),7);

	}

	@Test
	public void testGetGuavaImmutable() {
		ImmutableSample sample = new ImmutableSample();
		List<String> immutable = sample.getGuavaImmutable();
		assertEquals(immutable.size(),6);
		
		try {
			immutable.add("new color");
			fail("exception expected");
		} catch (Exception e) {
			//ok
		}
		
		sample.colors.add("new color");
		assertEquals(immutable.size(),6);

	}

	
	@Test
	public void testGetGuavaImmutable2() {
		ImmutableSample sample = new ImmutableSample();
		List<String> immutable = sample.getGuavaImmutable2();
		assertEquals(immutable.size(),6);
		
		try {
			immutable.add("new color");
			fail("exception expected");
		} catch (Exception e) {
			//ok
		}
	

	}
}
