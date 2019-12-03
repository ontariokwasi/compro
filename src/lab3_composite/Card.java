package lab3_composite;
public class Card  implements BoardComponent{
	private double price, discount;
	Card(double price, double discount){
		this.price = price;
		this.discount = discount;
	}
	public double netPrice() {
		return price ;
	}

	public double discountPrice() {
		return price - discount;
	}
  
  public double computePrice(){
    return netPrice();  
  }
}

