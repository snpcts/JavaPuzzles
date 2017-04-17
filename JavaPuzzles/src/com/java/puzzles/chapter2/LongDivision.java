package com.java.puzzles.chapter2;

public class LongDivision {
	public static void main(String[] args) {
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		
		final long MICROS_PER_DAY1 = 24l * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY1 = 24l * 60 * 60 * 1000;
		
		System.out.println(MICROS_PER_DAY);
		System.out.println(MILLIS_PER_DAY);
		
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
		
		System.out.println(MICROS_PER_DAY1 / MILLIS_PER_DAY1);

		
/*		
		When working with large numbers, watch out for overflow— it's a silent
		killer	*/	

	}
}