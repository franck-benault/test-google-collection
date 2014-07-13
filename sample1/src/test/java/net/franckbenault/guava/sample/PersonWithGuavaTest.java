package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonWithGuavaTest {

	private static PersonWithGuava p1;
	private static PersonWithGuava p2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p1 = new PersonWithGuava(1, "f1", "l1", new Date(), Gender.MALE , 80 );
		p2 = new PersonWithGuava(2, "f2", "l2", new Date(), Gender.FEMALE, 65 );
	
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
	

	@Test(expected=NullPointerException.class)
	public void testPersonNullPointerExceptionFirstname() {
		new PersonWithGuava(1, null, "l1", new Date(), Gender.MALE , 80);	
	}

	@Test(expected=NullPointerException.class)
	public void testPersonNullPointerExceptionLastname() {
		new PersonWithGuava(1, "f1", null, new Date(), Gender.MALE , 80);	
	}

	@Test(expected=NullPointerException.class)
	public void testPersonNullPointerExceptionBirthday() {
		new PersonWithGuava(1, "f1", "l1", null, Gender.MALE , 80);	
	}

	@Test(expected=NullPointerException.class)
	public void testPersonNullPointerExceptionGenre() {
		new PersonWithGuava(1, "f1", "l1", new Date(), null , 80);	
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPersonIllegalArgumentExceptionWeight() {
		new PersonWithGuava(1, "f1", "l1", new Date(), Gender.MALE , 0);	
	}
	
	
	@Test
	public void testPerson() {
		new PersonWithGuava(1, "f1", "l1", new Date(), Gender.MALE ,80 );		
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
	public void testCompareTo() {

		assertEquals(p1.compareTo(p1), 0);	
		assertEquals(p2.compareTo(p2), 0);	
		assertEquals(p1.compareTo(p2), -1);	
		assertEquals(p2.compareTo(p1), 1);	
	}
}
