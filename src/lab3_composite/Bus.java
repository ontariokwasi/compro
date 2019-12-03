package lab3_composite;

public class Bus implements BoardComponent{
	private double price, discount;

	Bus(double price, double discount) {
		this.price = price;
		this.discount = discount;
	}

	public double netPrice() {
		return price;
	}

	public double discountPrice() {
		return price - discount;
	}

	public double computePrice() {
		return netPrice();
	}
}
