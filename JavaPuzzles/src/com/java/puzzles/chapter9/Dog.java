package com.java.puzzles.chapter9;

public class Dog extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7118661254746033791L;
	public static final Dog INSTANCE = new Dog();

	private Dog() {
	}

	public String toString() {
		return "Woof";
	}
	
/*	private Object readResolve() {
		// Accept no substitutes!
		return INSTANCE;
		}*/

}