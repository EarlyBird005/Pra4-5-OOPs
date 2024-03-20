/* Describe abstract class called Shape which has three subclasses say Triangle, Rectangle, 
Circle. Define one method area() in the abstract class and override this area() in these three 
subclasses to calculate for specific object, i.e., area() of Triangle subclass should calculate 
area of triangle etc. Same for Rectangle and Circle. 
 */
import java.util.*;

abstract class Shape {
	abstract double area();
}

class Triangle extends Shape {
	private double a, b, c;

	Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	double area() {
		double s = (a + b + c) / 2;
		double tempArea = s * (s - a) * (s - b) * (s - c);
		return Math.sqrt(tempArea);
	}
}

class Rectangle extends Shape {
	private double width, length;

	Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	double area() {
		return this.width * this.length;
	}
}

class Circle extends Shape {
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	double area() {
		return Math.PI * this.radius * this.radius;
	}
}

public class P5_1 {
	public static void main(String[] args) {
		System.out.println("Name: Nanecha Dipak Kishorbhai\t Enrollment NO.: 220170116023");
		Date t = new Date();
		System.out.println(t + "\n");

		Triangle triangle = new Triangle(15, 24, 13);
		Rectangle rectangle = new Rectangle(6.8, 8.3);
		Circle circle = new Circle(2);

		System.out.printf("Area of Triangle: %.2f\n", triangle.area());
		System.out.printf("Area of Rectangle: %.2f\n", rectangle.area());
		System.out.printf("Area of Circle: %.2f", circle.area());
	}
}