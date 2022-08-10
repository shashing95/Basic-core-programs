package com.bridgelabz;

public class PowerOf2 {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int powerof2 = 1, i;
		for (i = 1; i <= number; i++) {
			powerof2 = 2 * powerof2;
			System.out.println(powerof2);
		}
	}

}
