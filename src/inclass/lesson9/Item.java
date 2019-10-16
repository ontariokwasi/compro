package inclass.lesson9;

public class Item {
	private String name;
	private double amount;

	public Item(String name, double amount) {
		super();
		this.name = name;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", amount=" + amount + "]";
	}

}
