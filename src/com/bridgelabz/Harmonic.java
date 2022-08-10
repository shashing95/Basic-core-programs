package com.bridgelabz;

import java.util.Scanner;

public class Harmonic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no.");
		int number = scanner.nextInt();

		double harmonicNumber = 0;
		for (double i = 1; i <= number; i++) {
			harmonicNumber = harmonicNumber + (1 / i);
		}
		System.out.println("n'th Harmonic Number of " + number + "" + harmonicNumber);
		scanner.close();

	}

}
