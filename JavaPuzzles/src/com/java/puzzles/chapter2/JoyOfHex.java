package com.java.puzzles.chapter2;

public class JoyOfHex {
	public static void main(String[] args) {
		
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
		
		System.out.println(hex2Decimal("0x100000000L"));

		System.out.println(hex2Decimal("0xcafebabe"));
		
		System.out.println(hex2Decimal("0x100000000L") + hex2Decimal("0xcafebabe"));
		
		System.out.println(decimal2Hex(889275715));

		
		System.out.println(decimal2Hex(hex2Decimal("0x100000000L") + hex2Decimal("0xcafebabe")));


		
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));

		
		
		
/*	The left operand is of type
	long, and the right operand is of type int. To perform the computation, Java promotes the int
	value to a long with a widening primitive conversion [JLS 5.1.2] and adds the two long values.
	Because int is a signed integral type, the conversion performs sign extension: It promotes the
	negative int value to a numerically equal long value.
	The right operand of the addition, 0xcafebabe, is promoted to the long value
	0xffffffffcafebabeL. This value is then added to the left operand, which is 0x100000000L. When
	viewed as an int, the high-order 32 bits of the sign-extended right operand are -1, and the highorder 32 bits of the left operand are 1. Add these two values together and you get 0, which explains
	the absence of the leading 1 digit in the program's output. Here is how the addition looks when done
	in longhand. (The digits at the top of the addition are carries.)

	1111111
		0xffffffffcafebabeL
		+ 0x0000000100000000L
	-------------------------
		0x00000000cafebabeL
		*/
		
		//Summary ------ it is generally best to avoid mixed-type computations
	

	}
	
	 public static int hex2Decimal(String s) {
	        String digits = "0123456789ABCDEF";
	        s = s.toUpperCase();
	        int val = 0;
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            int d = digits.indexOf(c);
	            val = 16*val + d;
	        }
	        return val;
	    }
	 
	 public static String decimal2Hex(int d) {
	        String digits = "0123456789ABCDEF";
	        if (d == 0) return "0";
	        String hex = "";
	        while (d > 0) {
	            int digit = d % 16;                // rightmost digit
	            hex = digits.charAt(digit) + hex;  // string concatenation
	            d = d / 16;
	        }
	        return hex;
	    }


}