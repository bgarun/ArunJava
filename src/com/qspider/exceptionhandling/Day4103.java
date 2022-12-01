package com.qspider.exceptionhandling;

//Propagation of Exception
class Contractor{
	void road() {
		System.out.println("construct the road");
		int a=1/0;
	}
}

class Minister{
	void develop() {
		System.out.println("Develop");
		Contractor ct=new Contractor();
		try {
		ct.road();
		}
		catch(ArithmeticException ref) {
			System.out.println("minister will handle exception");
		}
	}
}
class Cm{
	void rungovt() {
		System.out.println("Run the government");
		Minister m1=new Minister();
		try {
		m1.develop();
		}
		catch(ArithmeticException ref) {
			System.out.println("Chiefminister will handle exception");
			ref.printStackTrace();
		}
		
	}
}
public class Day4103 {
public static void main(String[] args) {
	System.out.println("People");
	Cm c=new Cm();
	c.rungovt();
	
}
}
