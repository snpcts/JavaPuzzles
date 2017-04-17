package com.java.puzzles.chapter3;

public class LastLaugh {
	public static void main(String args[]) {
		System.out.println("H" + "a"); // concatenates
		System.out.println('H' + 'a'); // addition 72 + 97
		
		StringBuffer sb = new StringBuffer(); // How to concatenate character?
		sb.append('H');
		sb.append('a');
		System.out.println(sb);
		
		System.out.println("" + 'H' + 'a');
		
		System.out.println("2 + 2 = " + 2+2);
		System.out.println("2 + 2 = " + (2+2));

		
		System.out.printf("%c%c", 'H', 'a'); //after 1.5


		
	}
}