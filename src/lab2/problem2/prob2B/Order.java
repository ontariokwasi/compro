package lab2.problem2.prob2B;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
	private int orderNum;
	private LocalDate orderDate;
	private List<OrderLine> orderline;
	public Order(int orderNum, LocalDate orderDate, int linenum, double price, int quantity) {
		this.orderNum = orderNum;
		this.orderDate = orderDate;
		orderline = new ArrayList<OrderLine>(Arrays.asList(new OrderLine(linenum,price, quantity, this)));
	}
	public List<OrderLine> getOrderline() {
		return orderline;
	}
	public void addOrderLine(int linenum, double price, int quantity) {
		orderline.add(new OrderLine(linenum, price, quantity, this));
	}
	@Override
	public String toString() {
		StringBuilder order = new StringBuilder("Order# "+orderNum+"\tDate: "
	+orderDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))+"\nLine#\tPrice\tQuantity\n");
		for(OrderLine ol : orderline) {
			order.append(ol+"\n");
		}
		return order.toString();
	}
	
}
