package com.java.puzzles.chapter2;

import java.math.BigDecimal;

public class Change {
	
	public static boolean isOdd1(int i) {
		return i % 2 == 1;
		}
	
	public static boolean isOdd2(int i) {
		return i % 2 != 0;
		}
	
	public static boolean isOdd3(int i) {
		return (i & 1) != 0;
		}
	
	// Summary to check the number is odd or even use isodd2 or isodd3 methods instead of isodd1 method
	
	public static void main(String args[]) {
		
		System.out.println(isOdd1(1));		
		System.out.println(isOdd1(-2));
		System.out.println(isOdd1(-3));
		
		System.out.println("==========================");
		
		System.out.println(isOdd2(1));
		System.out.println(isOdd2(-2));
		System.out.println(isOdd2(-3));
		
		System.out.println("==========================");

		
		System.out.println(isOdd3(1));
		System.out.println(isOdd3(-2));
		System.out.println(isOdd3(-3));
		
		System.out.println("==========================");






		
		System.out.println(2.00);
		System.out.println(1.10);
		System.out.println(2.00 - 1.10);
		
		System.out.printf("%.2f\n", 2.00 - 1.10); // Use 
		
		System.out.println((200 - 110) + " cents");
		
		
		
		
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
		
		System.out.println(new BigDecimal(2.00).subtract(new BigDecimal(1.10)));

	}
}

/*Binary floating-point is particularly ill-suited to monetary calculations

Always use the
BigDecimal(String) constructor, never BigDecimal(double)

In summary, avoid float and double where exact answers are required; for monetary

calculations, use int, long, or BigDecimal. For language designers, consider providing linguistic
support for decimal arithmetic. One approach is to offer limited support for operator overloading,
so that arithmetic operators can be made to work with numerical reference types, such as
BigDecimal. Another approach is to provide a primitive decimal type, as did COBOL and PL/I.*/