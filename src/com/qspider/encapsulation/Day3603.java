package com.qspider.encapsulation;

class Phone1{
	void normalmode() {
		System.out.println("call,message,access all the feature");
	}
}
class Phone2 extends Phone1 {
	void flightmode() {
		System.out.println("no network");
	}
}
public class Day3603 {
	public static void main(String[] args) {
		Phone1 p= new Phone2();
		p.normalmode();
		
	}

}
