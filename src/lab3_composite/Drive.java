package lab3_composite;

import java.util.List;

public class Drive implements Component {
	private double price, discount;
	Drive(double price, double discount){
		this.price = price;
		this.discount = discount;
	}
	public double netPrice() {
		return price ;
	}

	public double discountPrice() {
		return price - discount;
	}

	public double computePrice() {
		return discountPrice();
	}

	@Override
	public List<Component> getSub() {
		return null;
	}
}
