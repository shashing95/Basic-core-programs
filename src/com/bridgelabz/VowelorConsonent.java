package com.bridgelabz;

import java.util.Scanner;

public class VowelorConsonent {

	public static void main(String[] args) {
		char ch = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Alphabet : ");
		ch = scanner.next().charAt(0);
		if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u') {
			System.out.println("It is Vowel");
		} else {
			System.out.println("It is Consonant");
		}
		scanner.close();
	}

}
