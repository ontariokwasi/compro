package lab2.problem2.prob2B;

public class OrderLine {
	private int linenum;
	private double price;
	private int quantity;
	private Order order;

	OrderLine(int linenum, double price, int quantity, Order order) {
		this.linenum = linenum;
		this.price = price;
		this.quantity = quantity;
		this.order = order;
	}

	@Override
	public String toString() {
		return String.format("%d\t%.2f\t%d\t", linenum, price, quantity);
	}
	

}
