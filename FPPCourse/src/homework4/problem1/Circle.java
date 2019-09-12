package homework4.problem1;

public class Circle extends Shape{
	private double radius;
	Circle(String color, double radius){
		super(color);
		this.radius = radius;
	}
	@Override
	double calcualteArea() {
		//System.out.println("Area of "+this.getClass().getSimpleName()+" is: ");
		return Math.PI * radius * radius;
	}
	@Override
	double calculatePerimeter() {
		//System.out.println("Perimeter of "+this.getClass().getSimpleName()+" is: ");
		return 2 * Math.PI * radius;
	}
}
