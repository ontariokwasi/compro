package lab5.problem2;

public final class Triangle implements Figure{
	private final double height, base;
	
	public Triangle(double height, double base) {
		super();
		this.height = height;
		this.base = base;
	}

	@Override
	public double computeArea() {
		
		return 0.5 * base * height;
	}

	public double getHeight() {
		return height;
	}

	public double getBase() {
		return base;
	}
	
}
