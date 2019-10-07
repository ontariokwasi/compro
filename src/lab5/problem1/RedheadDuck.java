package lab5.problem1;

public class RedheadDuck extends Duck{

	RedheadDuck() {
		super(new Quack(), new FlyWithWings());
	}

	@Override
	public void display() {
		System.out.println("Displaying");
		
	}

}
