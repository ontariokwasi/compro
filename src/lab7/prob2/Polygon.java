package lab7.prob2;

public interface Polygon extends ClosedCurve {
	double [] getSides();
	
	default double computePerimeter() {
		double [] sides = getSides();
		double perimeter = 0;
		for(double d : sides)
			perimeter += d;
		return perimeter;
	}
}
