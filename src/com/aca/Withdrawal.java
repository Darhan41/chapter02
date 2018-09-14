package com.aca;

public class Withdrawal {

	public static void main(String[] args) {
		
		
		
		int withdrawal = 36;
		int twenties = withdrawal / 20;
		int remAfterTwenties = withdrawal - twenties * 20;
		int tens = remAfterTwenties / 10;
		int remAfterTens = remAfterTwenties - tens * 10;
		int fives = remAfterTens / 5;
		int remAfterFives = remAfterTens - fives * 5;
		int ones = remAfterFives;
				
//		System.out.println("Remainder of " + withdrawal + "-" + twenties * 20 + "=" + remAfterTwenties);  //used to test the remainder after $20
//		System.out.println("Remainder of " + remAfterTwenties + "-" + tens * 10 + "=" + remAfterTens);  //used to test the remainder after $10
//		System.out.println("Remainder of " + remAfterTens + "-" + fives * 5 + "=" + remAfterFives);  //used to test the remainder after $5
		
		System.out.println("Number of $20: " + twenties);
		System.out.println("Number of $10: " + tens);
		System.out.println("Number of $ 5: " + fives);
		System.out.println("Number of $ 1: " + ones);

	}

}
