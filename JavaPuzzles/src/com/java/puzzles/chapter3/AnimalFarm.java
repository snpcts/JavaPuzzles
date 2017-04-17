package com.java.puzzles.chapter3;

public class AnimalFarm {
	public static void main(String[] args) {
		final String pig = "length: 10";
		final String dog = "length: " + pig.length();
		System.out.println("Animals are equal: " + pig == dog);

		System.out.println(pig);
		System.out.println(dog);

		System.out.println("Animals are equal: " + (pig == dog));

		System.out.println(("Animals are equal: " + pig) == dog);

		System.out.println("Animals are equal: " + pig.equals(dog));

		System.out.println("======================================");

		System.out.println(System.identityHashCode(pig));
		System.out.println(System.identityHashCode("length: 10"));

		System.out.println("======================================");

		System.out.println(System.identityHashCode(dog));
		System.out.println(System.identityHashCode("length: " + pig.length()));
		System.out.println("======================================");

		System.out.println(System.identityHashCode("length: "));
		System.out.println(System.identityHashCode(pig.length()));
		
		System.out.println("======================================");

		System.out.println(pig.hashCode());
		System.out.println(dog.hashCode());
		
		System.out.println("======================================");

		System.out.println(pig.intern());
		
		System.out.println(dog.intern());
		
		System.out.println(pig.intern()==dog.intern());
		
		System.out.println("======================================");





		

	}
}