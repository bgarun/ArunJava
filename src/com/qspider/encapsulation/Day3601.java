package com.qspider.encapsulation;

class Prgm1{
	
}
class Prgm2 extends Prgm1{
	
}
public class Day3601 {
public static void main(String[] args) {
	Prgm2 p1= (Prgm2) new Prgm1();
	Prgm1 p2=new Prgm2();
}
}
