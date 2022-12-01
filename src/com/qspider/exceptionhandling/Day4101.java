package com.qspider.exceptionhandling;

// Try-catch block exception handling
import java.util.InputMismatchException;
import java.util.Scanner;
public class Day4101 {
public static void main(String[] args) {
	try {
		System.out.println("Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		int a=sc.nextInt();
		System.out.println("a="+a);
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("b="+b);
		int res=a/b;
		System.out.println("res="+res);
		System.out.println("No Exception encountered");	
	    }
	catch(ArithmeticException ref){
		System.out.println("Exception handled");
	}
	catch(InputMismatchException ref){
		System.out.println("Exception handled");
	}
	catch(Exception ref){
		System.out.println("Exception handled");
	}
	System.out.println("End");
}
}

