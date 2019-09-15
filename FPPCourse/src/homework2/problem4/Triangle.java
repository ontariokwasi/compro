package homework2.problem4;

public final class Triangle {
	private final double height;
	private final double base;
	
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}
	public double computeArea() {
		return 0.5*base*height;
	}
	public double getHeight() {
		return height;
	}
	public double getBase() {
		return base;
	}
	
	
}
