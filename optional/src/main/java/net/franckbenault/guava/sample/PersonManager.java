package net.franckbenault.guava.sample;

import com.google.common.base.Optional;

public class PersonManager {

	public static boolean sendPerson(Optional<Person> wrapper) {
		if(wrapper.isPresent()) {
			Person p = wrapper.get();
			System.out.println("send "+p);
			return true;
		} else {
			return false;
		}
	}
}
