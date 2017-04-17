package com.java.puzzles.chapter5;


/*The set of checked exceptions that a method can
throw is the intersection of the sets of checked exceptions that it is declared to throw in all
applicable types, not the union. As a result, the f method on an object whose static type is Type3
can't throw any checked exceptions at all. Therefore, Arcane3 compiles without error and prints
Hello world.*/

interface Type1 {
	void f() throws CloneNotSupportedException;
}

interface Type2 {
	void f() throws InterruptedException;
}

interface Type3 extends Type1, Type2 {
}

public class Arcane3 implements Type3 {
	public void f() {
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		
		Type3 t3 = new Arcane3();
		t3.f();
		
	}
}

/*interface Type1 {
	void f() throws CloneNotSupportedException;
}

interface Type2 {
	void f() throws InterruptedException;
}

interface Type3 extends Type1, Type2 {
}

public class Arcane3 implements Type3 {
	public void f() {
		System.out.println("Hello world");
	}

	
	public static void main(String[] args) {
		
		Type3 t3 = new Arcane3();
		t3.f();
		
	}
}*/

/*
interface Type1 {
	void f() throws CloneNotSupportedException, IOException;
}

interface Type2 {
	void f() throws InterruptedException, IOException;
}

interface Type3 extends Type1, Type2 {
}

public class Arcane3 implements Type3 {
	public void f() {
		System.out.println("Hello world");
	}


	public static void main(String[] args) throws IOException {

		Type3 t3 = new Arcane3();
		t3.f();

	}
}*/



