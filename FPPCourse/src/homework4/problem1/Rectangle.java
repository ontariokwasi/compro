package homework4.problem1;

public class Rectangle extends Shape{
	private double width;
	private double height;
	Rectangle(String color, double width, double height){
		super(color);
		this.width = width;
		this.height = height;
	}
	@Override
	double calcualteArea() {
		//System.out.println("Area of "+this.getClass().getSimpleName()+" is: ");
		return width * height;
	}
	@Override
	double calculatePerimeter() {
		//System.out.println("Perimeter of "+this.getClass().getSimpleName()+" is: ");
		return 2*(width + height);
	}
	
}
