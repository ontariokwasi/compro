package lab5.problem4.extpackage;

import java.time.LocalDate;

import lab5.problem4.CustOrderFactory;
import lab5.problem4.Customer;
import lab5.problem4.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.newCustomer("Bob");
		Order order = CustOrderFactory.newOrder(LocalDate.now(), cust);
		order.addItem(CustOrderFactory.newItem("Shirt"));
		order.addItem(CustOrderFactory.newItem("Laptop"));

		order = CustOrderFactory.newOrder(LocalDate.now(), cust);
		order.addItem(CustOrderFactory.newItem("Pants"));
		order.addItem(CustOrderFactory.newItem("Knife set"));

		System.out.println(cust.getOrders());
	}
}

		
