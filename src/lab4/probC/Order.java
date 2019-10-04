package lab4.probC;

import java.time.LocalDate;
import java.util.Date;

public class Order {
	//fields
	private String orderNo;
	private LocalDate orderDate;
	private int orderAmount;
	
	//constructor
	Order(String orderNo, LocalDate orderDate, int orderAmount) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	//getter, setter
	public String getOrderNo() {
		return orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}


	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	
}
