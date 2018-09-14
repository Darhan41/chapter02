package com.aca;

public class IntExtremes {

	public static void main(String[] args) {
		int positiveInt = 2_147_483_647;
		int negativeInt = -2_147_483_647;
		
		System.out.println("positiveInt: " + positiveInt);
		System.out.println(positiveInt + 1);
		negativeInt = negativeInt - 1;
		
		System.out.println(positiveInt + 1);
		System.out.println(negativeInt - 1);

	}

}
