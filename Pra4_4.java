/* Write a program that finds Volume of any shape by overloading volume () method for Cube, Rectangular Cube and Sphere. */
import java.util.*;

public class Pra4_4 {
    static float volume(float side, int shape) {
        if (shape == 1) {
            return (4 / 3.0f) * (float) Math.PI * side * side * side;
        } else {
            return side * side * side;
        }
    }

    static float volume(float length, float width, float height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        System.out.println("Name: Nanecha Dipak Kishorbhai\t Enrollment NO.: 220170116023");
        Date t = new Date();
        System.out.println(t + "\n");
        Scanner se = new Scanner(System.in);
        /*
         * System.out.print("Enter 1 to calculate volume of Sphere:");
         * int shape = se.nextInt();
         * add usage of function
         */
        se.close();
    }
}