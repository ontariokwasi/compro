package lab3_composite;

import java.util.*;

public class Cabinet {
	private Vector<Component> componentlist;
	
	private double price, discount;
	Cabinet(double price, double discount){
		this.price = price;
		this.discount = discount;
		componentlist = new Vector<>();
	}
	
	public double netPrice() {
		return price ;
	}

	public double discountPrice() {
		return price - discount;
	}
	
	public void addComponent(Component comp) {
		componentlist.addElement(comp);
	}

	public double computePrice() {
		double tmp = netPrice();
		for (Component comp : componentlist)
			tmp += comp.computePrice();
		return tmp;
	}
}
