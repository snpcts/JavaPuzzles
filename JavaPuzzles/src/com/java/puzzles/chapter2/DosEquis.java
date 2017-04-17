package com.java.puzzles.chapter2;

import java.io.PrintStream;//doubt

public class DosEquis {
	public static void main(String[] args) {
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 0);
		System.out.println(false ? i : x);
		
		PrintStream ps = new PrintStream(System.out);
		
		ps.println(toUnicode(x));
	      ps.println(toUnicode(i));
		
	}
	
	private static String toUnicode(char ch) {
	    return String.format("\\u%04x", (int) ch);
	}
	private static String toUnicode(int i) {
	    return String.format("\\u%04x",  i);
	}
}

/*In summary, it is generally best to use the same type for the second and third operands in
conditional expressions. */