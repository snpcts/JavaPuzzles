package com.java.puzzles.chapter3;

public class EscapeRout {
	public static void main(String[] args) {
		// \u0022 is the Unicode escape for double quote (")
		System.out.println("a\u0022.length() + \u0022b".length());
		
		System.out.println("a".length() + "b".length()); // above format is like this
		
		System.out.println("a\".length() + \"b".length()); // expected like this


	}
}


/*Java provides no special treatment for Unicode
	escapes within string literals. The compiler translates Unicode escapes into the characters they
	represent before it parses the program into tokens, such as strings literals [JLS 3.2]. Therefore, the
	first Unicode escape in the program closes a one-character string literal ("a"), and the second one
	opens a one-character string literal ("b"). The program prints the value of the expression
	"a".length() + "b".length(), or 2.*/