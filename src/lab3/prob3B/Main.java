package lab3.prob3B;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(4);
		Cylinder cylinder = new Cylinder(circle, 10);
		//test computeArea and ComputeVolume
		System.out.println(circle.computeArea());
		System.out.println(cylinder.computeVolume());

	}

}
