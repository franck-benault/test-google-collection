package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PaginationSampleTest {

	@Test
	public void testGetPagination() {
		List<List<String>> pagination = PaginationSample.getPagination();
		assertNotNull(pagination);
		assertEquals(pagination.size(),2);
		assertEquals(pagination.get(0).size(),4);
		System.out.println(pagination.get(0));
	}

}
