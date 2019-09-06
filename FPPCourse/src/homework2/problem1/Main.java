package homework2.problem1;

public class Main {
/**
 * In the main method of a Main class, create three instances of Customer (be sure to create instances of Address to populate their 
 * billingAddress and shippingAddress fields using setters). Add these instances to an array. Then loop through the array and 
 * print to the console all those Customers whose billingAddress is located in the city of Chicago (when you create instances of 
 * Customer initially, be sure to create at least one Customer whose billing address is in Chicago).
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer("Gideon", "Akomeng", "123456789");
		Customer customer2 = new Customer("Philip", "Sarfo", "567891234");
		Customer customer3 = new Customer("Adeoye", "Adesina", "456712389");
		customer1.setBillingAddress(new Address("1000 N.", "Fairfield", "Iowa", "57255"));
		customer1.setShippingAddress(new Address("SH 1000 N.", "SH Fairfield", "SH Iowa", "SH 57255"));
		customer2.setBillingAddress(new Address("1080 S.", "Chicago", "CHIC", "87255"));
		customer2.setShippingAddress(new Address("SH 1080 S.", "SH Chicago", "SH CHIC", "SH 87255"));
		customer3.setBillingAddress(new Address("1090 W.", "New York", "NYC", "77255"));
		customer3.setShippingAddress(new Address("SH 1090 W.", "SH New York", "SH NYC", "SH 77255"));
		Customer [] customers = {customer1, customer2, customer3};
		for(Customer customer : customers) {
			//Address custaddr = customer.getBillingAddress();
			if(customer.getBillingAddress().getCity().equals("Chicago"))
				System.out.println(customer);
		}
	}

}
