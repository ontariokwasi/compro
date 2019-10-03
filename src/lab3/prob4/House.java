package lab3.prob4;

public class House extends Property {
	//fields
	private double lotSize;
	
	//constructor
	House(String street, String city, String state, String zip,double lotSize){
		super(street,city,state,zip);
		this.lotSize = lotSize;
	}
	House(double lotSize){
		super();
		this.lotSize = lotSize;		
	}
	
	//getter
	public double getLotSize() {
		return this.lotSize;
	}

	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		return 0.1 * lotSize;
	}
	
}
