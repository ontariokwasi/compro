package lab3.prob4;

public class Address {
	//fields
	private String street;
	private String city;
	private String state;
	private String zip;
	
	//constructor
	Address(String street, String city, String state, String zip){
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	Address(){
		this(null,null,null,null);
	}
	
	@Override
	public String toString() {
		return "Address[" + street + " " + city + " " + state + " " + zip + "]";
	}
}
