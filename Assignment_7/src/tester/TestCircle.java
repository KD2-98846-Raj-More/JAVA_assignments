package tester;

import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Circle c = new Circle();

		System.out.println("Default Circle:");
		System.out.println("X: " + c.getMyX());
		System.out.println("Y: " + c.getMyY());
		System.out.println("Diameter: " + c.getMyDiameter());

		System.out.print("\nEnter new diameter: ");
		double diameter = sc.nextDouble();

		try {

			c.setMyDiameter(diameter);

			System.out.println("Diameter: " + c.getMyDiameter());

		} catch (NegativeDiameterException e) {

			System.out.println(e.getMessage());
		}

		sc.close();
	}
}