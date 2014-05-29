package net.franckbenault.guava.perf1;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class CommonsLangEmployee {

	private final String lastName;
	private final String firstName;
	private final String employerName;
	private final Gender gender;
	
	public CommonsLangEmployee (
			final String newLastName,
			final String newFirstName,
			final String newEmployerName,
			final Gender newGender) {
		
		this.lastName = newLastName;
		this.firstName = newFirstName;
		this.employerName = newEmployerName;
		this.gender = newGender;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		        .append(employerName)
		        .append(firstName)
		        .append(gender)
		        .append(lastName)
		        .toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		   if(obj instanceof CommonsLangEmployee){
		        final CommonsLangEmployee other = (CommonsLangEmployee) obj;
		        return new EqualsBuilder()
		            .append(employerName, other.employerName)
		            .append(firstName, other.firstName)
		            .append(gender, other.gender)
		            .append(lastName, other.lastName)
		            .isEquals();
		    } else{
		        return false;
		    }
	}

	
}

