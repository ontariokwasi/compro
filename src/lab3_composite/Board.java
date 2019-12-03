package lab3_composite;
import java.util.*;

public class Board  implements Component{
  private Vector<BoardComponent> bcomp;
  
  private double price, discount;
	Board(double price, double discount){
		this.price = price;
		this.discount = discount;
		bcomp = new Vector<>();
	}
	public double netPrice() {
		return price ;
	}

	public double discountPrice() {
		return price - discount;
	}
  
  public void addBoardComponent(BoardComponent bcom){
    bcomp.addElement(bcom);
  }
  
  public double computePrice() {
		double tmp = netPrice();
		for (BoardComponent comp : bcomp)
			tmp += comp.computePrice();
		return tmp;
	}
@Override
public List<Component> getSub() {
	return null;
}
}
