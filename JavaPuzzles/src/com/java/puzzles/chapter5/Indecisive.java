package com.java.puzzles.chapter5;

public class Indecisive {
	public static void main(String[] args) {
		System.out.println(decision());
	}

	static boolean decision() {
		try {
			return true;
		} finally {
			return false;
		}
	}
}


/*In summary, every finally block should complete normally, barring an unchecked exception.
Never exit a finally block with a return, break, continue, or tHRow, and never allow a
checked exception to propagate out of a finally block*/