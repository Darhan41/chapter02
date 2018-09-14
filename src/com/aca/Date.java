package com.aca;

public class Date {

	public static void main(String[] args) {
		
		String day = "Thursday";
		int date = 26;
		String month = "July";
		int year = 2018;
		String comma = ",";
		String space = " ";
		
//		System.out.println(day);
//		System.out.println(date);
//		System.out.println(month);
//		System.out.println(year);
//		System.out.println(comma);
//		System.out.println(space);
		
		
//		System.out.println(day + comma + space + month + space + date + comma + space + year);
		
		
//		System.out.print(day);
//		System.out.print(comma);
//		System.out.print(space);
//		System.out.print(month);
//		System.out.print(space);
//		System.out.print(date);
//		System.out.print(comma);
//		System.out.print(space);
//		System.out.print(year);
		
		System.out.println("American format: ");
		System.out.println(day + comma + space + month + space + date + comma + space + year);
		System.out.println("European format: ");
		System.out.println(day + space + date+ space + month+ space + year);
		
	}

}
