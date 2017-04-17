package com.java.puzzles.chapter3;

public class Abc {
	public static void main(String[] args) {
		String letters = "ABC";
		char[] numbers = { '1', '2', '3' };
		System.out.println(letters + " easy as " + numbers);
		
		System.out.println(letters + " easy as " +
				String.valueOf(numbers));
		
		System.out.print(letters + " easy as ");
		System.out.println(numbers);
		
		Object numbers1 = new char[] { '1', '2', '3' };
		System.out.print(letters + " easy as ");

		System.out.println(numbers1); // Invokes println(Object)
		
	}
}

/*To summarize, char arrays are not strings. To convert a char array to a string, invoke
String.valueOf(char[])*/