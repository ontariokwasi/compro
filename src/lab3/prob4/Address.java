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
	/*Address(){
		this(null,null,null,null);
	}*/ //Address every property should have an address no need for null address
	
	@Override
	public String toString() {
		return "Address[" + street + " " + city + " " + state + " " + zip + "]";
	}
	
	//getters for instance fields
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
}
