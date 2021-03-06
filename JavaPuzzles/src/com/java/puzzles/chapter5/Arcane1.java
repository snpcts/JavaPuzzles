package com.java.puzzles.chapter5;

import java.io.IOException;

public class Arcane1 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello world");
		} catch (IOException e) {
			System.out.println("I've never seen println fail!");
		}
	}
}


/*The first program, Arcane1, illustrates a basic principle of checked exceptions. It may look as
	though it should compile: The try clause does I/O, and the catch clause catches IOException. But
	the program does not compile because the println method isn't declared to throw any checked
	exceptions, and IOException is a checked exception. The language specification says that it is a
	compile-time error for a catch clause to catch a checked exception type E if the corresponding
	TRy clause can't throw an exception of some subtype of E [JLS 11.2.3]*/