package com.bridgelabz;

import java.util.Scanner;

public class TestMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Maximum max = new Maximum();                              //creating object

		System.out.println("Please enter the first number: ");          //taking input from user
		Float first = sc.nextFloat();
		System.out.println("Please enter the second number: ");
		Float second = sc.nextFloat();
		System.out.println("Please enter the third number: ");
		Float third = sc.nextFloat();
		max.floatMax(first, second, third);                             //passing the values to the method to compute the max Float

	}

}
