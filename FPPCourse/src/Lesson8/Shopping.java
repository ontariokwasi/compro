package Lesson8;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(iname,price);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj.getClass() != this.getClass()) return false;
		Shopping item = (Shopping) obj;
		return (item.getIname().equals(this.getIname()) && item.getPrice() == this.getPrice());
	}
	

}
