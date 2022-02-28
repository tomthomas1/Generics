package com.bridgelabz;

import java.util.Scanner;

public class TestMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Maximum max = new Maximum();                              //creating object

		System.out.println("Please enter the first number: ");          //taking input from user
		String first = sc.next();
		System.out.println("Please enter the second number: ");
		String second = sc.next();
		System.out.println("Please enter the third number: ");
		String third = sc.next();
		max.StringMax(first, second, third);                             //passing the values to the method to compute the max String

	}

}
