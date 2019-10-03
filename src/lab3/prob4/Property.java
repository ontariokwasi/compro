package lab3.prob4;

public abstract class Property {
	//fields
	Address address;
	
	//constructor 
	Property(String street, String city, String state, String zip){
		this.address = new Address(street,city,state,zip);
	}
	Property(){
		this.address = new Address();
	}
	
	//method
	public abstract double computeRent();
}
