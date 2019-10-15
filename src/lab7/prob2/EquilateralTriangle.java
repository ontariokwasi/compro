package lab7.prob2;

public class EquilateralTriangle implements Polygon {
	private double side;

	EquilateralTriangle(double side) {
		this.side = side;
	}

	@Override
	public double[] getSides() {
		double[] retval = { side, side, side };
		return retval;
	}

	@Override
	public double computePerimeter() {

		return 3 * side;
	}

}
