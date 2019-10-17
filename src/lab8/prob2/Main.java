package lab8.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>(Arrays.asList(new Product("Phone", 10.0, 1),
				new Product("Laptop", 200.0, 2), new Product("Car", 3000.0, 3), new Product("Bicycle", 40.0, 4)));

		// 1. Using price comparator
		Collections.sort(products, new PriceComparator());
		System.out.println(products);

		// 2. Using Title comparator
		Collections.sort(products, new TitleComparator());
		System.out.println(products);

		//3. using closure in anonymous way
		Collections.sort(products, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
	}

}
