package com.app.geometry;

public class Point2D {

	private double x;
	private double y;

	// Parameterized constructor
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Return point details
	public String getDetails() {
		return "Point(" + x + ", " + y + ")";
	}

	// Check whether two points are equal
	public boolean isEqual(Point2D anotherPoint) {
		return this.x == anotherPoint.x && this.y == anotherPoint.y;
	}

	// Calculate distance between two points
	public double calculateDistance(Point2D anotherPoint) {
		double dx = this.x - anotherPoint.x;
		double dy = this.y - anotherPoint.y;

		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}
}
