package lab8.prob2;

import java.util.Comparator;

public class TitleComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		return o1.getTitle().compareToIgnoreCase(o2.getTitle());
	}

}
