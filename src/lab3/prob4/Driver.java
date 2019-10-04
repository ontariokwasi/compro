package lab3.prob4;

public class Driver {

	public static void main(String[] args) {

		Property[] properties = { new House("1000N", "Farfield", "IA", "52557", 9000), new Condo("1000N", "Farfield", "IA", "52557",2), new Trailer("1000S", "Chicago", "CHI", "72757") };
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println(totalRent);
		
		System.out.println(Admin.propsLocatedAt(properties, "Farfield"));
	}
}
