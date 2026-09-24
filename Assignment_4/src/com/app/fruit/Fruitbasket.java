package com.app.fruit;

import java.util.Scanner;

public class Fruitbasket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter basket size: ");
		int n = sc.nextInt();

		Fruit[] basket = new Fruit[n];

		int counter = 0;
		int choice;

		do {
			System.out.println("\n----- Fruit Basket Menu -----");
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits");
			System.out.println("5. Display details of all fresh fruits");
			System.out.println("6. Display tastes of all stale fruits");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits as stale");

			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 0:
				System.out.println("Exiting...");
				break;

			case 1:
				if (counter < basket.length) {

					System.out.print("Enter name: ");
					String name = sc.next();

					System.out.print("Enter weight: ");
					double weight = sc.nextDouble();

					System.out.print("Enter color: ");
					String color = sc.next();

					basket[counter++] = new Mango(name, weight, color);

					System.out.println("Mango added successfully.");

				} else {
					System.out.println("Basket is full.");
				}
				break;

			case 2:
				if (counter < basket.length) {

					System.out.print("Enter name: ");
					String name = sc.next();

					System.out.print("Enter weight: ");
					double weight = sc.nextDouble();

					System.out.print("Enter color: ");
					String color = sc.next();

					basket[counter++] = new Orange(name, weight, color);

					System.out.println("Orange added successfully.");

				} else {
					System.out.println("Basket is full.");
				}
				break;

			case 3:
				if (counter < basket.length) {

					System.out.print("Enter name: ");
					String name = sc.next();

					System.out.print("Enter weight: ");
					double weight = sc.nextDouble();

					System.out.print("Enter color: ");
					String color = sc.next();

					basket[counter++] = new Apple(name, weight, color);

					System.out.println("Apple added successfully.");

				} else {
					System.out.println("Basket is full.");
				}
				break;

			case 4:
				System.out.println("\nNames of fruits:");

				for (Fruit fruit : basket) {
					if (fruit != null) {
						System.out.println(fruit.getName());
					}
				}
				break;

			case 5:
				System.out.println("\nFresh fruits:");

				for (Fruit fruit : basket) {
					if (fruit != null && fruit.getIsFresh()) {
						System.out.println(fruit);
						System.out.println("Taste: " + fruit.taste());
					}
				}
				break;

			case 6:
				System.out.println("\nTastes of stale fruits:");

				for (Fruit fruit : basket) {
					if (fruit != null && !fruit.getIsFresh()) {
						System.out.println(
								fruit.getName() + " : " + fruit.taste());
					}
				}
				break;

			case 7:
				System.out.print("Enter index of fruit to mark stale: ");
				int index = sc.nextInt();

				if (index >= 0 && index < basket.length && basket[index] != null) {
					basket[index].setIsFresh(false);
					System.out.println("Fruit marked as stale.");
				} else {
					System.out.println("Invalid index.");
				}
				break;

			case 8:
				for (Fruit fruit : basket) {
					if (fruit != null && fruit.taste().equals("sour")) {
						fruit.setIsFresh(false);
					}
				}

				System.out.println("All sour fruits marked as stale.");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 0);

		sc.close();
	}
}