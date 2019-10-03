package lab3.prob4;

public class Trailer extends Property {
	//constructor
	Trailer(String street, String city, String state, String zip){
		super(street,city,state,zip);
	}
	Trailer(){
		super();
	}

	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		return 500;
	}
}
