package lab3.prob3B;

import lab3.prob3A.Cylinder;

public class Circle {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public double computeArea() {
		return Math.PI*radius*radius;
	}
}