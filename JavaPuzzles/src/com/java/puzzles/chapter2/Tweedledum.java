package com.java.puzzles.chapter2;

public class Tweedledum {
	
	public static void main(String[] args) {
		
		short x = 0;
		int i = 123456;
		
		
				
		x += i;
		// x = x + i; Won't compile - "possible loss of precision"
		System.out.println(x);
		
		Object y = "Buy ";
		String j = "Effective Java!";

		
		y = y + j;
		
		System.out.println(y);
		
		 y = "Buy ";
		 j = "Effective Java!";

		
		
		System.out.println(y+=j);

	}

}


/*In summary, compound assignment operators silently generate a cast. If the type of the result of the
computation is wider than that of the variable, the generated cast is a dangerous narrowing cast.
Such casts can silently discard precision or magnitude. */