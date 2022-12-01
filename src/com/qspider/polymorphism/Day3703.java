package com.qspider.polymorphism;

class Debitcard{
	long cardno=1234567895468l;
	void swipe() {
		System.out.println("swipe to start");
	}
}
class Bank{
	void add(int a, int b) {
		
	}
	void atm(Debitcard ref) {
		System.out.println(ref.cardno);
		ref.swipe();
	}
}
public class Day3703 {
public static void main(String[] args) {
	Bank b=new Bank();
	b.atm(new Debitcard());
}
}
