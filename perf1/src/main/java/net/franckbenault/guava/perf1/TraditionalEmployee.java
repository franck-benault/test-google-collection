package net.franckbenault.guava.perf1;

public class TraditionalEmployee {

	private final String lastName;
	private final String firstName;
	private final String employerName;
	private final Gender gender;
	
	public TraditionalEmployee (
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
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((employerName == null) ? 0 : employerName.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TraditionalEmployee other = (TraditionalEmployee) obj;
		if (employerName == null) {
			if (other.employerName != null)
				return false;
		} else if (!employerName.equals(other.employerName))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender != other.gender)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	
}
