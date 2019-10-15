package lab7.prob2;

public class Ellipse implements ClosedCurve {
	private double semiAxes;
	private double eInterval;

	Ellipse(double semiAxes, double eInterval) {
		this.semiAxes = semiAxes;
		this.eInterval = eInterval;
	}

	@Override
	public double computePerimeter() {

		return 4 * semiAxes * eInterval;
	}

}
