package tester;

import java.util.Scanner;

public class CreditlimitCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of customers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("\nEnter details for Customer " + i);

			System.out.print("Enter account number: ");
			int accountNumber = sc.nextInt();

			System.out.print("Enter beginning balance: ");
			int beginningBalance = sc.nextInt();

			System.out.print("Enter total charges: ");
			int charges = sc.nextInt();

			System.out.print("Enter total credits: ");
			int credits = sc.nextInt();

			System.out.print("Enter credit limit: ");
			int creditLimit = sc.nextInt();

			
			int newBalance = beginningBalance + charges - credits;

			System.out.println("Account Number: " + accountNumber);
			System.out.println("New Balance: " + newBalance);

			
			if (newBalance > creditLimit) {
				System.out.println("Credit limit exceeded");
			}
		}

		sc.close();
	}
}
