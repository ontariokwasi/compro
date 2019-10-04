package lab4.probC;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
	//fields
	private double commission;
	private double baseSalary;
	private List<Order> orders;
	
	//constructor
	Commissioned(String empId, double commission, double baseSalary,List<Order> orders) {
		super(empId);
		this.baseSalary = baseSalary;
		this.commission = commission;
		this.orders = orders;
	}
	
	//associations
	public void addOrder(Order e) {
		orders.add(e);
	}
	
	//functions
	public int countPreviousMonthOrders(int month, int year) {
		LocalDate ldate = LocalDate.of(year, month, 1).minusMonths(1);
		int countMonth = ldate.getMonthValue();
		int countYear = ldate.getYear();
		
		//count the previous orders
		int count = 0;
		for(Order o:orders) {
			if(countMonth == o.getOrderDate().getMonthValue() && countYear == o.getOrderDate().getYear()) {
				count +=o.getOrderAmount();
			}//end_if
		}
		return count;
	}
	
	@Override
	public double calcGrossPay(int month, int year) {
		int numberPreOrders = countPreviousMonthOrders(month,year);
		return baseSalary + commission*numberPreOrders;
	}

}
