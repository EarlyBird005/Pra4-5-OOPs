/* Create a base class Shape. Use this class to store two double type values that could be used to compute area of any shape. Derive two specific classes called Triangle and Rectangle from the base shape. Add to the base a member function getdata() to initialize base class data member and another member function displayArea() to compute and display the area of figures. (Use Method Overriding). */
import java.util.*;

class Shape {
    double a, b;

    Shape() {}

    void getData(Scanner se) {
        System.out.print("Enter dimension 1: ");
        this.a = se.nextDouble();
        System.out.print("Enter dimension 2: ");
        this.b = se.nextDouble();
    }

    void displayArea() {}
}

class Triangle extends Shape {
    private double c;

    Triangle() {
    }

    void getData(Scanner se) {
	super.getData(se);
	System.out.print("Enter dimension 3: ");
        this.c = se.nextDouble();	
    }
    @Override
    void displayArea() {
        // System.out.println(0.5 * a * b);

	double s = (a + b + c) / 2;
        double tempArea = s * (s - a) * (s - b) * (s - c);
	System.out.println((float)Math.pow(tempArea, 0.5));
    }
}

class Rectangle extends Shape {
    Rectangle() {
    }

    @Override
    void displayArea() {
        System.out.println((float)(a * b));
    }
}

public class Pra4_6 {
    public static void main(String[] args) {
        System.out.println("Name: Nanecha Dipak Kishorbhai\t Enrollment NO.: 220170116023");
        Date t = new Date();
        System.out.println(t + "\n");
        Scanner se = new Scanner(System.in);

	System.out.println("Triangle:);
        Triangle tri = new Triangle();
        tri.getData(se);
        tri.displayArea();

	System.out.println("Rectangle:);
        Rectangle r = new Rectangle();
        r.getData(se);
        r.displayArea();
        se.close();

    }
}