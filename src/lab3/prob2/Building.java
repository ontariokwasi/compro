package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {

	private double maintainance;
	private List<Apartment> appartment;

	Building() {
		appartment = new ArrayList<Apartment>();
	}

	public double getMaintainance() {
		return maintainance;
	}

	public void setMaintainance(double cost) {
		this.maintainance = cost;
	}

	public List<Apartment> getAppartment() {
		return appartment;
	}

	public double getTotalRent(){
		if (this.appartment == null)
			return 0.0;
		double rent = 0;
		for (Apartment apartment : this.appartment) {
			rent += apartment.getRent();
		}
		return rent;
	}
	//
	public void addApartment(double rent) {
		appartment.add(new Apartment(rent));
	}
}
