package com.aca;

public class Time {

	public static void main(String[] args) {
		int hour = 21;
		int minute = 2;
		int second = 0;
		int secInaDay = 24 * 3600;
		int secSinceMidnight = hour * 3600 + minute * 60 + second;
		int secRemDay = secInaDay - secSinceMidnight;
		
		float secElapsed = secSinceMidnight;
		float secPerDay = secInaDay;
		float percentOfDay = (secElapsed / secPerDay) * 100;
		
		System.out.println( "      Total seconds in a day: " + secInaDay);
		System.out.println( "total seconds since midnight: " + secSinceMidnight);
		System.out.println( "           seconds remaining: " + secRemDay);
		System.out.println( "       Percent of day passed: " + percentOfDay + "%");

	}

}
