package lab5.problem2;

public final class Circle implements Figure {
	private final double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double computeArea() {

		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

}
