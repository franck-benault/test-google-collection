package net.franckbenault.guava.sample;

import java.util.Date;

import com.google.common.base.Objects;

public class Person implements Comparable<Person> {

	private Integer id;
	private String firstname;
	private String lastname;
	private Date birthday;
	private Genre genre;
	
	
	public Person(Integer id, 
			String firstname, 
			String lastname, 
			Date birthday, 
			Genre genre) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
		this.genre = genre;
		
	}
	
	public int hasCode() {
		
		return Objects.hashCode(birthday, firstname, lastname);
	}
	
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Person other = (Person) obj;
		
		return Objects.equal(birthday, other.birthday) &&
				Objects.equal(firstname, other.firstname) &&
				Objects.equal(lastname, other.lastname);
	}
	
	public String toString() {
		return Objects.toStringHelper("Person")
				.add("firstname", firstname)
				.add("lastname", lastname)
				.add("genre", genre).toString();
	}

	@Override
	public int compareTo(Person other) {
		int result = firstname.compareTo(other.firstname);
		if(result!=0) {
			return result;
		}
		
		result = lastname.compareTo(other.lastname);
		if(result!=0) {
			return result;
		}
		
		result = birthday.compareTo(other.birthday);
		return result;
	}
	
}
