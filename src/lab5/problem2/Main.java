package lab5.problem2;

public class Main {

	public static void main(String[] args) {
		Figure [] figures = {new Rectangle(2, 6), new Circle(4), new Triangle(3, 4)};
		double totalArea = 0.0;
		for(Figure f : figures) {
			totalArea += f.computeArea();
		}
		System.out.printf("Sum of Areas = %.2f", totalArea);

	}

}
