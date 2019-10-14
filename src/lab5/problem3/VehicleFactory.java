package lab5.problem3;

public class VehicleFactory {
	public static Vehicle getVehicle(String type) {
		
		if(type.equalsIgnoreCase("Bus"))
			return new Bus();
		
		if(type.equalsIgnoreCase("Truck"))
			return new Truck();
		
		if(type.equalsIgnoreCase("Car"))
			return new Car();
		
		if(type.equalsIgnoreCase("Electric"))
			return new ElectricCar();
		
		return null;
	}
}
