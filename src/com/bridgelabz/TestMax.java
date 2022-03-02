package com.bridgelabz;

import java.util.Scanner;

public class TestMax {
	public static void main(String[] args) {                                                  //main method to find maximum
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Maximum max;
		System.out.println("---------Find Maximum-------- ");
		
		while(true) {                                                                         // asking user to select the generic type
			System.out.println(" \n 1. Integers\n 2. Float\n 3. String\n 4. Exit");
			System.out.print(" Please enter your choise from above:  \n ");
			int opt = scan.nextInt();
			
			switch(opt) {                                                                     //taking input from user
			case 1:
			{
				System.out.print(" Please enter the first Integer value: ");
				Integer first = scan.nextInt();
				
				System.out.print(" Please enter the second Integer value: ");
				Integer second = scan.nextInt();
				
				System.out.print(" Please enter the third Integer value: ");
				Integer third = scan.nextInt();
				max = new Maximum<Integer>(first, second, third);                             //creating object 
				max.GenMax();                                                                 //calling method
				break;
			}				
			case 2:
			{
				System.out.print(" Please enter the first float value: ");
				Float first = scan.nextFloat();
				
				System.out.print(" Please enter the second float value: ");
				Float second = scan.nextFloat();
				
				System.out.print(" Please enter the third float value: ");
				Float third = scan.nextFloat();
				max = new Maximum<Float>(first, second, third);
				max.GenMax();
				break;
			}
			case 3:
			{
				System.out.print(" Please enter the first string : ");
				String first = scan.next();
				
				System.out.print(" Please enter the second string: ");
				String second = scan.next();
				
				System.out.print(" Please enter the third string: ");
				String third = scan.next();
				max = new Maximum<String>(first, second, third);
				max.GenMax();
				break;
			}
			case 4:
				System.out.println(" You have exited from the program!!");
				scan.close();
				return;
			default:
				System.out.println("Please enter a valid input from above");				
			}
				
		}
	}

}
