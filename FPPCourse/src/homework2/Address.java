package homework2;

public class Address {
//street, city, state and zip
	private String street, city, state, zip;
	
	public Address(String street, String city, String state, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		
	}

	public String getCity() {
		return city;
	}
}
