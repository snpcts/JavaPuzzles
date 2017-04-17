package com.java.puzzles.chapter9;

public class SelfInterruption {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		if (Thread.currentThread().isInterrupted()) {
			System.out.println("Interrupted: " + Thread.currentThread().isInterrupted());
		} else {
			System.out.println("Not interrupted: " + Thread.currentThread().isInterrupted());
		}
		
		if (Thread.interrupted()) {
			System.out.println("Interrupted: " + Thread.interrupted());
		} else {
			System.out.println("Not interrupted: " + Thread.interrupted());
		}
	}
}

/*
The lesson of this puzzle is: Don't use THRead.interrupted unless you want to clear the
interrupted status of the current thread. If you just want to query it, use isInterrupted instead.
The lesson for API designers is that methods should have names that describe their primary
functions. Given the behavior of THRead.interrupted, it should have been named
clearInterruptStatus. Its return value is secondary to the state change it effects. Especially when
a method has a name that is less than perfect, it is important that its documentation clearly describe
its behavior*/