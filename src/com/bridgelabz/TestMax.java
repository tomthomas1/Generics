package com.bridgelabz;

import java.util.Scanner;

public class TestMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MaxInteger max = new MaxInteger();                              //creating object

		System.out.println("Please enter the first number: ");          //taking input from user
		Integer first = sc.nextInt();
		System.out.println("Please enter the second number: ");
		Integer second = sc.nextInt();
		System.out.println("Please enter the third number: ");
		Integer third = sc.nextInt();
		max.IntMax(first, second, third);                              //passing the values to the method to compute the max Integer

	}

}
