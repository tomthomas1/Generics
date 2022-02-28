package com.bridgelabz;

public class MaxInteger {
	public void IntMax(Integer first, Integer second, Integer third) {
		int max = first;                                  //considering first is max and assigning max to first
		 String position = "first";                       //for displaying the position
		if (second.compareTo(max) > 0) {	
			max = second;                                //comparing with first max and if greater that assigning to max
			position = "second";
		}
		 if (third.compareTo(max) > 0) {                //comparing with max Integer and if greater that assigning to max
			max = third;
			position = "third";
		}  System.out.println("The maximum number is in " + position + " position and the number is : "   + max);
	}

}
