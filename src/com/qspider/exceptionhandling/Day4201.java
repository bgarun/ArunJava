package com.qspider.exceptionhandling;



public class Day4201 {
public static void main(String[] args) {
	try {
		//int a=1/0;
		throw new ArithmeticException(); //
	}
	catch(ArithmeticException ref) {
		System.out.println("Exception occured and handled");
	}
	System.out.println("The end...");
}
}
