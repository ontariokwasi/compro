package lab5.problem3;

public class Mian {

	public static void main(String[] args) {
		Vehicle [] vehicles = {
				VehicleFactory.getVehicle("Truck"), 
				VehicleFactory.getVehicle("Bus"),
				VehicleFactory.getVehicle("Car"), 
				VehicleFactory.getVehicle("Electric")
				};
		for(Vehicle vehicle : vehicles) {
			vehicle.startEngine();
		}
	}

}
