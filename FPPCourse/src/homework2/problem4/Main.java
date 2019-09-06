package homework2.problem4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter C for Circle\n" + 
				"Enter R for Rectangle\n" + 
				"Enter T for Triangle\n");
		Scanner sc = new Scanner(System.in);
		String figure = sc.nextLine();
		switch (figure) {
		case "C":
			System.out.println("Enter the radius of the Circle\n");
			double radius = sc.nextDouble();
			System.out.println("The area of Circle is: " + new Circle(radius).computeArea());
			break;
		case "R":
			System.out.println("Enter the heigt of the Rectangle\n");
			double height = sc.nextDouble();
			System.out.println("Enter the width of the Rectangle\n");
			double width = sc.nextDouble();
			System.out.println("The area of Rectangle is: " + new Rectangle(height, width).computeArea());
			break;
		case "T":
			System.out.println("Enter the heigt of the Triangle\n");
			double height_t = sc.nextDouble();
			System.out.println("Enter the width of the Triangle\n");
			double base = sc.nextDouble();
			System.out.println("The area of Triangle is: " + new Triangle(height_t, base).computeArea());
			break;

		default:
			System.out.println("Unknown figure");
			break;
		}
		sc.close();

	}

}
