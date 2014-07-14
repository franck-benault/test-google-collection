package net.franckbenault.guava.sample;

import java.util.Date;

import com.google.common.base.Objects;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkArgument;
import com.google.common.collect.ComparisonChain;

public class PersonWithGuava implements Comparable<PersonWithGuava> {

	private Integer id;
	private String firstname;
	private String lastname;
	private Date birthday;
	private Gender gender;
	private double weight;
	
	public PersonWithGuava(final Integer id, 
			final String firstname, 
			final String lastname, 
			final Date birthday, 
			final Gender gender,
			final double weight) {
		

		this.id = id;
		this.firstname = checkNotNull(firstname, "Firstname must not be null");
		this.lastname = checkNotNull(lastname, "Lastname must not be null");
		this.birthday = checkNotNull(birthday, "Birthday must not be null");
		this.gender = checkNotNull(gender, "Gender must not be null");
		checkArgument(weight>0, "Weight must not be negative");
		this.weight = weight;

	}
	
	public int hashCode() {
		
		return Objects.hashCode(birthday, firstname, lastname);
	}
	
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		PersonWithGuava other = (PersonWithGuava) obj;
		
		return Objects.equal(birthday, other.birthday) &&
				Objects.equal(firstname, other.firstname) &&
				Objects.equal(lastname, other.lastname);
	}
	
	public String toString() {
		return Objects.toStringHelper("Person")
				.add("firstname", firstname)
				.add("lastname", lastname)
				.add("gender", gender).toString();
	}

	@Override
	public int compareTo(PersonWithGuava other) {
		
		return ComparisonChain.start()
				.compare(firstname,other.firstname)
				.compare(lastname,other.lastname)
				.compare(birthday,other.birthday)
				.result();

	}
	
}
