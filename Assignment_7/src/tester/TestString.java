package tester;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		try {

			int length = str.length();

			System.out.println("Length of string: " + length);

			if (length > 80) {
				throw new ExceptionLineTooLong("The strings is too long");
			}

			System.out.println("String length is valid.");

		} catch (ExceptionLineTooLong e) {

			System.out.println(e.getMessage());
		}

		sc.close();
	}
}