package com.qspider.polymorphism;
//Downcasting
class Engineering{
	void subject() {
		System.out.println("engineering subjects");
	}
}
class Skill extends Engineering{
	void subject() {
		System.out.println("hypermesh design software");
	}
}
public class Day3801 {
public static void main(String[] args) {
	Engineering e=new Skill();
	e.subject();
	//Skill e2= (Skill) e;
	//e2.hypermesh();
	
}
}
