package net.franckbenault.guava.sample;

public class PersonQueries {

	
	public static Person findByName(String name) {
		
		if(name.equals("Sophie")) 
			return new Person(name);
		else
			return null;
	}
}
