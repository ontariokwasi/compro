package Lesson8;

public class Shopping {
	private String iname;
	private double price;

	public Shopping(String iname, double price) {
		super();
		this.iname = iname;
		this.price = price;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[iName="+iname+" Price="+price+"]";
	}

}
