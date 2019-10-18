package lab8.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>(
				Arrays.asList(new Product("Phone", 10.0, 1), new Product("Laptop", 200.0, 2),
						new Product("Car", 4000.0, 5), new Product("Bicycle", 40.0, 4), new Product("Car", 3500.0, 3)));

		// a. Using price comparator
		Collections.sort(products, new PriceComparator());
		System.out.println(products);

		// b. Using Title comparator
		Collections.sort(products, new TitleComparator());
		System.out.println(products);

		// c. using closure
		// 1. sort by price
		System.out.println(sortBy(products, "price"));

		// 2. sort by price
		System.out.println(sortBy(products, "Title"));

		// d. sort with model if title are same using lambda
		Collections.sort(products, (o1, o2) -> {
			if (o1.getTitle().compareTo(o2.getTitle()) != 0)
				return o1.getTitle().compareTo(o2.getTitle());
			else
				return ((Integer) o1.getModel()).compareTo((Integer) o2.getModel());
		});

		System.out.println(products);
	}

	// Combined comparator method
	public static List<Product> sortBy(List<Product> productList, String sortby) {
		class myComparator implements Comparator<Product> {

			@Override
			public int compare(Product o1, Product o2) {
				if (sortby.equalsIgnoreCase("price"))
					return ((Double) o1.getPrice()).compareTo((Double) o2.getPrice());
				else if (sortby.equalsIgnoreCase("title"))
					return o1.getTitle().compareTo(o2.getTitle());
				else
					throw new IllegalStateException();
			}

		}
		Collections.sort(productList, new myComparator());

		return productList;
	}

}
