package lab8.prob2;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		return ((Double)o1.getPrice()).compareTo((Double)o2.getPrice());
	}

}
