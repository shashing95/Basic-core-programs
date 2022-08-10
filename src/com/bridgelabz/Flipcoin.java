package com.bridgelabz;

import java.util.Scanner;

public class Flipcoin {

	public static void main(String[] args) {
		int i, heads = 0, tails = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("number of times to flip coin ");
		int flipcoin = sc.nextInt();
		sc.close();
		for (i = 1; i <= flipcoin; i++) {
			double random = Math.random();
			if (random < 0.5) {
				heads++;
			} else {
				tails++;
			}
		}

		System.out.println("Number of heads : " + heads);
		System.out.println("Number of tails : " + tails);
		double hpercent = (double) heads / flipcoin * 100;
		double tpercent = (double) tails / flipcoin * 100;
		System.out.println("The percentage of Heads is " + hpercent + "%");
		System.out.println("The percentage of Tails is " + tpercent + "%");

	}

}
