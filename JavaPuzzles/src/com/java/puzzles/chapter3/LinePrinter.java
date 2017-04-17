package com.java.puzzles.chapter3;

public class LinePrinter {
public static void main(String[] args) {
/*// Note: \u000A is Unicode representation of linefeed (LF)
*/char c = 0x000A;
System.out.println(c);
}
}

//Note: 
//\u000A 
//is 
//Unicode representation of linefeed (LF)
//The lesson is simple: Avoid Unicode escapes except where they are truly necessary