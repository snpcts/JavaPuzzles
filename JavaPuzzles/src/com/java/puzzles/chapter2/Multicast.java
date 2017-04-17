package com.java.puzzles.chapter2;

public class Multicast {
	public static void main(String[] args) {
		System.out.println((int) (char) (byte) -1);
		
		System.out.println(Integer.toBinaryString((byte) -1));
		
		System.out.println(Integer.toBinaryString((char) (byte) -1));
		
		System.out.println(Integer.toBinaryString( (int) (char) (byte) -1));
		
		System.out.println(Integer.parseInt(Integer.toBinaryString( (int) (char) (byte) -1),2));


		
		//System.out.println((char) Integer.parseInt("11111111111111111111111111111111",2));

		
		System.out.println((int) (char) (byte) 1);

	}
}


/*Sign extension is
	performed if the type of the original value is signed; zero extension if it is a char, regardless of
	the type to which it is being converted*/