package com.java.puzzles.chapter2;

import java.util.ArrayList;
import java.util.List;

public class Elementary {
	public static void main(String[] args) {
		
		System.out.println(12345 + 5432l);
		System.out.println(12345 + 54321);
		
		System.out.println(12345 + 5432L);

		
		
		List<String> l = new ArrayList<String>();
		l.add("Foo");
		System.out.println(1);
		System.out.println(l);

	/*	Always use a
		capital el (L) in long literals, never a lowercase el (l). 
		avoid using a lone el (l) as a variable name. */
		
		
		

	}
}