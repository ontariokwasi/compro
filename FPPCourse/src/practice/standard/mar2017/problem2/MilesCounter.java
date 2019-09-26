package practice.standard.mar2017.problem2;

import java.util.ArrayList;
import java.util.List;

public class MilesCounter {
	public static List<Vehicle> convertArray(Object[] vehicleArray) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		for(Object vehicle : vehicleArray)
			vehicles.add((Vehicle) vehicle);
		return vehicles;
	}
	
	
	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		int totalmiles = 0;
		for(Vehicle vehicle : vehicleList)
			totalmiles += vehicle.getMilesUsedToday();
		return totalmiles;
	}
}
