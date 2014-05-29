package net.franckbenault.guava.perf1;

import com.google.common.base.Objects;

public class GuavaEmployee {

	private final String lastName;
	private final String firstName;
	private final String employerName;
	private final Gender gender;
	
	public GuavaEmployee (
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
		return Objects.hashCode(employerName, firstName, gender, lastName); 
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GuavaEmployee other = (GuavaEmployee) obj;
		return Objects.equal(employerName, other.employerName) &&
		Objects.equal(firstName, other.firstName) &&
		Objects.equal(gender, other.gender) &&
		Objects.equal(lastName, other.lastName); 
		
	}

	
}
