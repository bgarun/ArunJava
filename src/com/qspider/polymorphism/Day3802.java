
package com.qspider.polymorphism;

class Normalrecharge1 {
void normalpack() {
	System.out.println("Call, Internet");
}	
}
class Specialrecharge1 extends Normalrecharge1
{
	void hotstar() 
	{
		System.out.println("Hotstar membership");
	}
}

public class Day3802 {
	public static void main(String[] args) {
		Normalrecharge1 n=new Specialrecharge1();
		n.normalpack();
		Specialrecharge1 n2=(Specialrecharge1)n;
		n2.hotstar();
		
	}

}
