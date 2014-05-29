package net.franckbenault.guava.perf1;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GuavaEmployeeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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

	private long myFirstTest() {
		long start = System.currentTimeMillis();

		Set<GuavaEmployee> mySet = new HashSet<GuavaEmployee>();
		
		for(int i=0; i<100000; i++) {
			GuavaEmployee e1 = new GuavaEmployee (
				"lastName"+i,
				"firstName"+i,
				"employerName"+i,
				Gender.FEMALE);
			GuavaEmployee e2 = new GuavaEmployee (
					"lastName"+i,
					"firstName"+i,
					"employerName"+i,
					Gender.MALE);
			mySet.add(e1);
			mySet.add(e2);
			
		}
		long duree = System.currentTimeMillis()- start;
		//System.out.println(duree);
		return duree;
	}	
	
	private long mySecondTest() {
		long start = System.nanoTime();

		for(int i=0; i<100000; i++) {
			GuavaEmployee e1 = new GuavaEmployee (
				"lastName"+i,
				"firstName"+i,
				"employerName"+i,
				Gender.FEMALE);
			GuavaEmployee e2 = new GuavaEmployee (
					"lastName"+i,
					"firstName"+i,
					"employerName"+i,
					Gender.MALE);
			e1.hashCode();
			e2.hashCode();
			
		}
		long duree = System.nanoTime()- start;
		//System.out.println(duree);
		return duree;
	}
	

	private long myThirdTest() {
		long start = System.nanoTime();

		for(int i=0; i<100000; i++) {
			GuavaEmployee e1 = new GuavaEmployee (
				"lastName"+i,
				"firstName"+i,
				"employerName"+i,
				Gender.FEMALE);
			GuavaEmployee e2 = new GuavaEmployee (
					"lastName"+i,
					"firstName"+i,
					"employerName"+i,
					Gender.MALE);
			e1.equals(e2);
			
		}
		long duree = System.nanoTime()- start;
		//System.out.println(duree);
		return duree;
	}
	
	@Test
	public void testHashCode() {
		long duree=0;
		for(int i=0; i<10; i++) {
			duree += myFirstTest();
		}
		System.out.println("Guava ==>"+duree/10);
	}
	
	@Test
	public void testHashCode2() {
		long duree=0;
		for(int i=0; i<10; i++) {
			duree += mySecondTest();
		}
		System.out.println("Guava HashCode ==>"+duree/1000000);
	}
	
	@Test
	public void testEquals() {
		long duree=0;
		for(int i=0; i<10; i++) {
			duree += myThirdTest();
		}
		System.out.println("Guava Equals ==>"+duree/1000000);
	}

}
