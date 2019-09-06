package homework2_4;

public class Circle {
	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double computeArea() {
		return Math.PI*radius*radius;
	}
}
