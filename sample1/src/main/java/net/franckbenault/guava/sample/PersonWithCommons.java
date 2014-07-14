package net.franckbenault.guava.sample;


import java.util.Date;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;



public class PersonWithCommons implements Comparable<PersonWithCommons> {

	private Integer id;
	private String firstname;
	private String lastname;
	private Date birthday;
	private Gender gender;
	private double weight;
	
	public PersonWithCommons(final Integer id, 
			final String firstname, 
			final String lastname, 
			final Date birthday, 
			final Gender gender,
			final double weight) {
		
		this.id = id;

		if(firstname==null)
			throw new NullPointerException("Firstname must not be null");		
		this.firstname = firstname;

		if(lastname==null)
			throw new NullPointerException("Lastname must not be null");		

		this.lastname = lastname;

		if(birthday==null)
			throw new NullPointerException("Birthday must not be null");

		this.birthday = birthday;

		if(gender==null)
			throw new NullPointerException("Gender must not be null");

		this.gender = gender;

		if(weight<=0)
			throw new IllegalArgumentException("Weight must not be negative");

		this.weight = weight;

	}
	

	public int hashCode() {
		return new HashCodeBuilder()
		        .append(birthday)
		        .append(firstname)
		        .append(lastname)
		        .toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
        final PersonWithCommons other = (PersonWithCommons) obj;		
		
		
        return new EqualsBuilder()
            .append(birthday, other.birthday)
            .append(firstname, other.firstname)
            .append(lastname, other.lastname)
            .isEquals();
		
	}

		
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("Person{firstname=");
		builder.append(firstname);
		builder.append(", lastname=");
		builder.append(lastname);
		builder.append(", gender=");
		builder.append(gender);
		builder.append("}");
		
		return builder.toString();
		
		
		
	}

	@Override
	public int compareTo(PersonWithCommons other) {
		
		
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
