package lab5.problem1;

public class MallardDuck extends Duck{

	MallardDuck() {
		super(new Quack(), new FlyWithWings());
	}

	@Override
	public void display() {
		System.out.println("Display");
		
	}

}
