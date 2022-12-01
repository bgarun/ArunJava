package com.qspider.polymorphism;


class Normalfuel {
void normalrun() {
	System.out.println("normal performance of engine");
}	
}
class Powerplus extends Normalfuel
{
	void power() 
	{
		System.out.println("Enhanced performance");
	}
}
class Vehicle{
	void fuel(Normalfuel f1) {
		f1.normalrun();
	}
	void fuel1(Powerplus f2) {
		f2.power();
	}
}
public class Day3705 {
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.fuel(new Normalfuel());
		v.fuel(new Powerplus());
		v.fuel1(new Powerplus());
		
	}

}
