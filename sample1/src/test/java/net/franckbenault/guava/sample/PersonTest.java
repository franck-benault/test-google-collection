package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {

	private static Person p1;
	private static Person p2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p1 = new Person(1, "f1", "l1", new Date(), Genre.MALE );
		p2 = new Person(2, "f2", "l2", new Date(), Genre.FEMALE );
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	

	@Test
	public void testEquals() {
		Object o1 = new Object();
		
		assertTrue(p1.equals(p1));

		assertFalse(p1.equals(null));
		assertFalse(p1.equals(o1));
		assertFalse(p1.equals(p2));		
	}
	
	@Test
	public void testHashCode() {

		
		assertEquals(p1.hasCode(), p1.hasCode());		
		assertFalse(p1.hasCode()==p2.hasCode());	
	}

	@Test
	public void testToString() {

		System.out.println(p1.toString());
		assertNotNull(p1.toString());		
		assertFalse(p1.toString().equals(p2.toString()));	
	}


	@Test
	public void testCompareTog() {

		assertEquals(p1.compareTo(p1), 0);	
		assertEquals(p2.compareTo(p2), 0);	
		assertEquals(p1.compareTo(p2), -1);	
		assertEquals(p2.compareTo(p1), 1);	
	}
}
