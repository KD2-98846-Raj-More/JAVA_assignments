package com.app.fruit;

public abstract class Fruit {

	private String color;
	private double weight;
	private String name;
	private boolean isFresh;

	public Fruit(String name, double weight, String color) {
		this.name = name;
		this.weight = weight;
		this.color = color;
		this.isFresh = true;
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public boolean getIsFresh() {
		return isFresh;
	}

	public void setIsFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Color: " + color + ", Weight: " + weight;
	}

	public abstract String taste();
}