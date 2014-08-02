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
	public void testSendPerson_OK_V2() {
		
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
}
