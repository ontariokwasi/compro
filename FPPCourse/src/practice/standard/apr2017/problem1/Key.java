package practice.standard.apr2017.problem1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(firstName,lastName);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj.getClass() != this.getClass()) return false;
		Key ob = (Key)obj;
		return (ob.firstName.equals(this.firstName) && ob.lastName.equals(this.lastName));
	}
	
}
