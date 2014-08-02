package net.franckbenault.guava.sample;

import com.google.common.base.Optional;

public class PersonManager {
	
	public static final String DEFAULT_NAME = "John";

	public static boolean sendPerson(Optional<Person> wrapper) {
		if(wrapper.isPresent()) {
			Person p = wrapper.get();
			System.out.println("send "+p);
			return true;
		} else {
			System.out.println("nobody to send");
			return false;
		}
	}
	
	public static boolean sendPersonV2(Optional<Person> wrapper) {
		Person p = wrapper.orNull();
		if(p!=null) {
			System.out.println("send "+p);
			return true;
		} else {
			System.out.println("nobody to send");
			return false;
		}
	}
	
	public static Person sendPersonWithDefaultPerson(Optional<Person> wrapper) {
		Person p = wrapper.or(new Person(DEFAULT_NAME));
		
		System.out.println("send "+p);
		return p;
		
	}
}
