package lab3.prob3B;

public class Cylinder {
	private double height;
	private Circle circle;
	
	public Cylinder(Circle circle, double height) {
		this.height = height;
		this.circle = circle;
	}
	public double getHeight() {
		return this.height;
	}
	public double computeVolume() {
		return circle.computeArea()*height;
	}
}
