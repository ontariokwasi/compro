package homework4.problem1;

public class Main {

	public static void main(String[] args) {
		Shape rectangle1 = new Rectangle("Red", 4, 8);
		Shape rectangle2 = new Rectangle("Blue", 3, 7);
		Shape square1 = new Square("Orange", 4);
		Shape squrae2 = new Square("Pink", 8);
		Shape circle = new Circle("Yellow", 5);
		
		Shape [] shapes = {rectangle1, rectangle2, square1, squrae2, circle};
		printTotal(shapes);

	}
	 static void printTotal(Shape[] shapes) {
		 double totalArea = 0.0;
		 double totalPerimeter = 0.0;
		 for(Shape shape : shapes) {
			 //System.out.println("The Area of "+shape.getClass().getSimpleName()+" is: "+shape.calcualteArea());
			 totalArea += shape.calcualteArea();
			 //System.out.println("The Perimeter of "+shape.getClass().getSimpleName()+" is: "+shape.calculatePerimeter());
			 totalPerimeter += shape.calculatePerimeter();
			 //System.out.println();
		 }
		 System.out.println("Total Area: "+totalArea+"\nTotal Perimeter: "+totalPerimeter);
	 }

}
