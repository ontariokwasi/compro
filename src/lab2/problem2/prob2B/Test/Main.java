package lab2.problem2.prob2B.Test;

import java.time.LocalDate;

import lab2.problem2.prob2B.Order;

public class Main {
	public static void main(String [] args) {
		Order order1 = new Order(1, LocalDate.now(), 101, 20, 3);
		order1.addOrderLine(102, 5, 4);
		
		Order order2 = new Order(2, LocalDate.now().plusDays(-1), 201, 20, 3);
		order2.addOrderLine(202, 5, 4);
		order2.addOrderLine(203, 10, 8);
		
		System.out.println(order1);
		System.out.println(order2);
	}
}
