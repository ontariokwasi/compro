package lab7.prob3;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("Displaying");

	}

	@Override
	public void quack() {
		System.out.println("Cannot quack");
	}

	@Override
	public void fly() {
		System.out.println("Cannot fly");
	}

}
