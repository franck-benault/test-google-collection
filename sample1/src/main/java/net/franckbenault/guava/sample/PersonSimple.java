package net.franckbenault.guava.sample;

import java.util.Date;



public class PersonSimple implements Comparable<PersonSimple> {

	private Integer id;
	private String firstname;
	private String lastname;
	private Date birthday;
	private Gender gender;
	private double weight;
	
	public PersonSimple(final Integer id, 
			final String firstname, 
			final String lastname, 
			final Date birthday, 
			final Gender gender,
			final double weight) {
		

		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
		this.gender = gender;
		this.weight = weight;

	}
	
	public int hasCode() {
		final int prime = 31;
		int result =1;
		
		result = prime * result + ((birthday==null ? 0 : birthday.hashCode()));
		result = prime * result + ((firstname==null ? 0 : firstname.hashCode()));
		result = prime * result + ((lastname==null ? 0 : lastname.hashCode()));
		
		return result; 
	}
	
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		PersonSimple other = (PersonSimple) obj;
		
		if(birthday==null) {
			if (other.birthday != null) {
				return false;
			}
		} else if(!birthday.equals(other.birthday))
			return false;
		
		if(firstname==null) {
			if (other.firstname != null) {
				return false;
			}
		} else if(!firstname.equals(other.firstname))
			return false;

		if(lastname==null) {
			if (other.lastname != null) {
				return false;
			}
		} else if(!lastname.equals(other.lastname))
			return false;

		return true;
		
	}
	
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("Person [firstname=");
		builder.append(firstname);
		builder.append(", lastname=");
		builder.append(lastname);
		builder.append(", gender");
		builder.append(gender);

		return builder.toString();
		
		
		
	}

	@Override
	public int compareTo(PersonSimple other) {
		
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
