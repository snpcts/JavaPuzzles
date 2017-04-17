package com.java.puzzles.chapter2;

public class CleverSwap {
	public static void main(String[] args) {
		int x = 1984; // (0x7c0)
		int y = 2001; // (0x7d1)
		x ^= y ^= x ^= y;
		
		System.out.println("x = " + x + "; y = " + y);
		
		 x = 1984; // (0x7c0)
		 y = 2001; // (0x7d1)
		
		y = (x ^= (y ^= x)) ^ y;
		
		System.out.println("x = " + x + "; y = " + y);
		
		int a[] = {0};
		
		for (int i = 0; i < 1; i++) {

			  x = a[i]++ ;			// Here x is 0 even a[i] is 1 - Do not assign to the same variable more than once in a single expression
		}

		System.out.println(x);
		System.out.println(a[0]);

		
	}
}

/*int tmp = x;
x = y;
y = tmp;

Long ago, when central processing units had few registers, it was discovered that one could avoid
the use of a temporary variable by taking advantage of the property of the exclusive OR operator (^)
that (x ^ y ^ x) == y:
	
	// Swaps variables without a temporary - Don't do this!
	x = x ^ y;
	y = y ^ x;
	x = y ^ x;
	
	// The actual behavior of x ^= y ^= x ^= y in Java
	int tmp1 = x; // First appearance of x in the expression
	int tmp2 = y; // First appearance of y
	int tmp3 = x ^ y; // Compute x ^ y
	x = tmp3; // Last assignment: Store x ^ y in x
	y = tmp2 ^ tmp3; // 2nd assignment: Store original x value in y
	x = tmp1 ^ y; // First assignment: Store 0 in x
	
	The lesson is simple: Do not assign to the same variable more than once in a single expression.
	Expressions containing multiple assignments to the same variable are confusing and seldom do
	what you want. Even expressions that assign to multiple variables are suspect. More generally,
	avoid clever programming tricks. They are bug-prone, difficult to maintain, and often run more
	slowly than the straightforward code they replace */
	
	
	

	
	


