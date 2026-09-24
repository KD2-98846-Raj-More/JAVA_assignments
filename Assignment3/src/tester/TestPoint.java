package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Accept coordinates of first point
		System.out.print("Enter x and y coordinates of Point 1: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();

		// Accept coordinates of second point
		System.out.print("Enter x and y coordinates of Point 2: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		// Create two points
		Point2D p1 = new Point2D(x1, y1);
		Point2D p2 = new Point2D(x2, y2);

		// Display point details
		System.out.println("Point 1: " + p1.getDetails());
		System.out.println("Point 2: " + p2.getDetails());

		// Check whether points are equal
		if (p1.isEqual(p2)) {
			System.out.println("Both points are at the same position.");
		} else {
			System.out.println("Both points are different.");

			// Calculate and display distance
			double distance = p1.calculateDistance(p2);
			System.out.println("Distance between points: " + distance);
		}

		sc.close();
	}
}