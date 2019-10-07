package lab5.problem2;

public final class Rectangle implements Figure{
	private final double width, length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double computeArea() {
		
		return length * width;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
}
