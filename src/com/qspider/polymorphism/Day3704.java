package com.qspider.polymorphism;


class Normalrecharge {
void normalpack() {
	System.out.println("Call, Internet");
}	
}
class Specialrecharge extends Normalrecharge
{
	void hotstar() 
	{
		System.out.println("Hotstar membership");
	}
}
class Phone{
	void access(Normalrecharge n1) {
		n1.normalpack();
	}
	void access1(Specialrecharge n2) {
		n2.hotstar();
	}
}
public class Day3704 {
	public static void main(String[] args) {
		Phone p=new Phone();
		p.access(new Normalrecharge());
		p.access(new Specialrecharge());
		p.access1(new Specialrecharge());
		
	}

}
