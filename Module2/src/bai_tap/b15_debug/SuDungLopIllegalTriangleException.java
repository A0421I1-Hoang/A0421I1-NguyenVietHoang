package b15_debug;

import java.util.Scanner;

public class SuDungLopIllegalTriangleException {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        boolean repeatSidesInput = true;
        do {
            // Prompt the user to enter three sides of the triangle
            System.out.print("Enter three side of the triangle: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();

            // Create triangle object with user input
            Triangle triangle = new Triangle(side1, side2, side3);
            repeatSidesInput = false;

            System.out.println(triangle.toString());
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());

        } while (repeatSidesInput);
    }
}
