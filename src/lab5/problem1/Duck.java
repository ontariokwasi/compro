package lab5.problem1;

public abstract class Duck {
	private QuackBehavior quackBehavior;
	private FlyBehavior flyBehavior;
	
	Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior){
		this.quackBehavior = quackBehavior;
		this.flyBehavior = flyBehavior;
	}
	
	public abstract void display();
	
	public void swim() {
		System.out.println("Swimming");
	}
	
	public void fly() {
		flyBehavior.fly();
	}
	
	public void quack() {
		quackBehavior.quack();
	}

}
