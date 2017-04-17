package com.java.puzzles.chapter5;

public class Arcane2 {
	public static void main(String[] args) {
		try {
			// If you have nothing nice to say, say nothing
		} catch (Exception e) {
			System.out.println("This can't happen");
		}
	}
}


/*By the same token, the second program, Arcane2, may look as though it shouldn't compile, but it
	does. It compiles because its sole catch clause checks for Exception. Although the JLS is not
	terribly clear on this point, catch clauses that catch Exception or Throwable are legal regardless
	of the contents of the corresponding try clause. Although Arcane2 is a legal program, the
	contents of its catch clause will never be executed; the program prints nothing*/