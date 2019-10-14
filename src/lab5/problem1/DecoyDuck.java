package lab5.problem1;

public class DecoyDuck extends Duck{

	DecoyDuck() {
		super(new MuteQuack(), new CannotFly());
	}

	@Override
	public void display() {
		System.out.println("Displaying");
		
	}

}
