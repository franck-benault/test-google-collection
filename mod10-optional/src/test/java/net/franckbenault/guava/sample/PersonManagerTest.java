package net.franckbenault.guava.sample;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.common.base.Optional;

public class PersonManagerTest {

	@Test
	public void testSendPerson() {
		
		Person p = PersonQueries.findByName("Sophie");
		Optional<Person> wrapper = Optional.absent();
		if (p!=null) {
			wrapper = Optional.of(p);
		} 
		assertTrue(PersonManager.sendPerson(wrapper));
	}

	@Test
	public void testSendPerson_OK2() {
		
		Person p = PersonQueries.findByName("Sophie");
		Optional<Person> wrapper = Optional.fromNullable(p);
		
		assertTrue(PersonManager.sendPerson(wrapper));
	}
	
	@Test
	public void testSendPerson_NotOK() {
		
		Person p = PersonQueries.findByName("Sophi");
		Optional<Person> wrapper = Optional.fromNullable(p);
		
		assertFalse(PersonManager.sendPerson(wrapper));
	}
	
	@Test
	public void testSendPerson_NotOK2() {
		
		Optional<Person> wrapperEmpty = Optional.absent();
		
		assertFalse(PersonManager.sendPerson(wrapperEmpty));
	}


	@Test
	public void testSendPersonWithDefaultPerson() {
		
		Person p = PersonQueries.findByName("Sophie");
		Optional<Person> wrapper = Optional.absent();
		if (p!=null) {
			wrapper = Optional.of(p);
		} 
		assertEquals(PersonManager.sendPersonWithDefaultPerson(wrapper).getName(), "Sophie");
	}

	@Test
	public void testSendPersonWithDefaultPerson_OK2() {
		
		Person p = PersonQueries.findByName("Sophie");
		Optional<Person> wrapper = Optional.fromNullable(p);
		
		assertEquals(PersonManager.sendPersonWithDefaultPerson(wrapper).getName(), "Sophie");
	}
	
	@Test
	public void testSendPersonWithDefaultPerson_NotOK() {
		
		Person p = PersonQueries.findByName("Sophi");
		Optional<Person> wrapper = Optional.fromNullable(p);
		
		assertEquals(PersonManager.sendPersonWithDefaultPerson(wrapper).getName(), PersonManager.DEFAULT_NAME);
	}
	
	@Test
	public void testSendPersonWithDefaultPerson_NotOK2() {
		
		Optional<Person> wrapperEmpty = Optional.absent();
		
		assertEquals(PersonManager.sendPersonWithDefaultPerson(wrapperEmpty).getName(), PersonManager.DEFAULT_NAME);
	}
	
	@Test
	public void testSendPersonV2() {
		
		Person p = PersonQueries.findByName("Sophie");
		Optional<Person> wrapper = Optional.absent();
		if (p!=null) {
			wrapper = Optional.of(p);
		} 
		assertTrue(PersonManager.sendPersonV2(wrapper));
	}

	@Test
	public void testSendPersonV2_OK2() {
		
		Person p = PersonQueries.findByName("Sophie");
		Optional<Person> wrapper = Optional.fromNullable(p);
		
		assertTrue(PersonManager.sendPersonV2(wrapper));
	}
	
	@Test
	public void testSendPersonV2_NotOK() {
		
		Person p = PersonQueries.findByName("Sophi");
		Optional<Person> wrapper = Optional.fromNullable(p);
		
		assertFalse(PersonManager.sendPersonV2(wrapper));
	}
	
	@Test
	public void testSendPersonV2_NotOK2() {
		
		Optional<Person> wrapperEmpty = Optional.absent();
		
		assertFalse(PersonManager.sendPersonV2(wrapperEmpty));
	}
}
