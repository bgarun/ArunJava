package com.qspider.exceptionhandling;

//try-catch-finally block
public class Day4102 {
public static void main(String[] args) {
	try {
		System.out.println("Jion the course");
		System.out.println("Be regular to class");
		int a=1/0;
		System.exit(0);
	}
	catch(ArithmeticException ref) {
		System.out.println("join next batch");
	}
	finally {
		System.out.println("get the skill");
		System.out.println("Attend the interview");
		System.out.println("Get placed");
		
	}
}
}
