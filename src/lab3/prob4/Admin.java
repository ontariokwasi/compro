package lab3.prob4;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property o : properties) {
			totalRent += o.computeRent();
		}
		return totalRent;
	}
	
	public static List<Property> propsLocatedAt(Property[] properties, String city) {
		List<Property> props = new ArrayList<Property>();
		for(Property prop : properties)
			if(prop.getAddress().getCity().equalsIgnoreCase(city))
				props.add(prop);
		
		return props;
	}
}
