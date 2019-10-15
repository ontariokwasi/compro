package lab7.prob2;

public interface Polygon extends ClosedCurve {
	double [] getSides();
	
	default double computePerimeter() {
		return 0.0;
	}
}
