package net.franckbenault.guava.sample;

import java.util.Date;

import com.google.common.base.Objects;

public class Person {

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
	
}
