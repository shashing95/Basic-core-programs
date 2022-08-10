package com.bridgelabz;

public class Factors {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int i;
		System.out.println("Factors of " +number+ " is ");
		for(i=2;i<=number;i++)
		{
			if(number % i == 0)
			{
			System.out.println(i);
            number = number/i;
			}
		}
		if(number >2) {
			System.out.println("Prime factors of given number are: " +number);
		}
	}  

	}


