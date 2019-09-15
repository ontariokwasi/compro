package homework2.problem4;

public final class Circle {
	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double computeArea() {
		return Math.PI*radius*radius;
	}
}
