package net.franckbenault.guava.sample;

public class Person {

	private Integer id;
	private String firstname;
	
	
	
	public int hasCode() {
		return 1;
	}
	
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		return true;
	}
	
}
