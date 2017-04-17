package com.java.puzzles.chapter8;

class Base {
	public String className = "Base";
}

class Derived extends Base {
	private String className = "Derived";

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}

public class PrivateMatter {
	public static void main(String[] args) {
		System.out.println(new Derived().getClassName());
	}
}