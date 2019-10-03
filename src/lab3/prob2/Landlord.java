package lab3.prob2;

public class Landlord {

	public static void main(String[] args) {
		// assume the landlord has 3 buildings
		Building b1 = new Building();
		Building b2 = new Building();
		Building b3 = new Building();
		
		// buiding1 has 4 apartments
		b1.addApartment(1000);
		b1.addApartment(1200);
		b1.addApartment(1300);
		b1.addApartment(1400);

		// buiding2 has 3 apartments
		b2.addApartment(1500);
		b2.addApartment(1400);
		b2.addApartment(1300);

		// buiding2 has 2 apartments
		b3.addApartment(2500);
		b3.addApartment(2400);
		
		//set each building's maintenance cost
		b1.setMaintainance(2500);
		b2.setMaintainance(2000);
		b3.setMaintainance(1500);
		
		//all buildings
		Building[] buildings = {b1,b2,b3};
		double totalIncome = 0.0;
		double totalMaintenanceCost = 0.0;
		for(Building b : buildings) {
			totalIncome += b.getTotalRent();
			totalMaintenanceCost += b.getMaintainance();
		}
		double profit = totalIncome-totalMaintenanceCost;
		System.out.println("Landlord's Total Income: "+totalIncome);
		System.out.println("Landlord's Total Profit: "+profit);
		
	}

}
