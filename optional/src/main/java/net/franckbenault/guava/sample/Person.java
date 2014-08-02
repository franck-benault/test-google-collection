package net.franckbenault.guava.sample;

import com.google.common.base.Objects;

public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return Objects.toStringHelper("Person")
				.omitNullValues()
				.add("name", name)
				.toString();
	}

}
