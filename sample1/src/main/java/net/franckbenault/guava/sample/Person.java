package net.franckbenault.guava.sample;

public class Person {

	private Integer id;
	private String firstname;
	
	public Person(Integer id, String firstname) {
		this.id = id;
		this.firstname = firstname;
	}
	
	public int hasCode() {
		final int prime=31;
		int result =1;
		
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		
		return result;
	}
	
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Person other = (Person) obj;
		
		if(firstname==null) {
			if(other.firstname!=null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		
		return true;
	}
	
}
