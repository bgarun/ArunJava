package com.qspider.encapsulation;
//Up-casting
class Yono1{
	void banking() {
		System.out.println("balance, statement, amount transfer");
	}
}
class Yono2 extends Yono1 {
	void loan() {
		System.out.println("personal loan, home loan,vehicle loan");
	}
}
public class Day3602 {
public static void main(String[] args) {
	Yono1 y= new Yono2();
	y.banking();
	
}
}
