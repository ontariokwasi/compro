package lab5.problem4;

import java.time.LocalDate;

public class CustOrderFactory {

	public static Order newOrder(LocalDate date, Customer cust) {
		if(cust == null) throw new  NullPointerException("Customer can't be null");
		Order ord = new Order(date);
		cust.addOrder(ord);
		return ord;
	}
	
	public static Customer newCustomer(String name) {
		if(name == null) throw new NullPointerException("Customer name is required");
		return new Customer(name);
	}
	
	public static Item newItem(String itemName) {
		if(itemName == null ) throw new NullPointerException("Item name is required"); 
		return new Item(itemName);
	}

}
