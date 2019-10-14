package lab5.problem1;

public class RubberDuck extends Duck{

	RubberDuck() {
		super(new Squeak(), new CannotFly());
	}

	@Override
	public void display() {
		System.out.println("Displaying");
		
	}

}
