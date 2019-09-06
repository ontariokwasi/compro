package homework2.problem1;

public class Customer {
/**
 * Create your own Customer class. A Customer has a firstName, lastName, socSecurityNum (which you can represent as a String), 
 * also it has billingAddress and a shippingAddress(which you can represent as a type of Address. 
 * Initialize billingAddress and shippingAddress through its setter from Customer class.
Create a constructor for your Customer class to initialize firstName, lastName and socSecurityNum. 
Create getter, and setter methods for all five attributes.
Create an Address class with the attributes such as street, city, state and zip(which you can represent as a String). 
Create a constructor to initialize fields of Address class.
Your Customer class should have a toString() method that provides a string representation of the customer. 
A typical toString() output would be "[Joe, Smith, ssn: 332-221-4444]". Just copy this code in your Customer class.
public String toString() {
return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum+ "]";
}
 * */
	private String firstName, lastName, socSecurityNum;
	private Address billingAddress, shippingAddress;
	
	public Customer(String firstName, String lastName, String socSecurityNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocSecurityNum() {
		return socSecurityNum;
	}
	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum+ "]";
	}
	
	
}
