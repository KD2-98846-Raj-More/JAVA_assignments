package tester;

public class Circle {

	private double myX;
	private double myY;
	private double myDiameter;

	// Default constructor
	public Circle() {
		myX = 0;
		myY = 0;
		myDiameter = 100;
	}

	// Accessor for X coordinate
	public double getMyX() {
		return myX;
	}

	// Accessor for Y coordinate
	public double getMyY() {
		return myY;
	}

	// Accessor for diameter
	public double getMyDiameter() {
		return myDiameter;
	}

	// Method to set diameter
	public void setMyDiameter(double myDiameter)
			throws NegativeDiameterException {

		if (myDiameter < 0) {
			throw new NegativeDiameterException(
					"Diameter cannot be negative");
		}

		this.myDiameter = myDiameter;
	}
}