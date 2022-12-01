package com.qspider.polymorphism;


//Run time polymorphism
class Loan{
	public void homeloan() {
		System.out.println("Home loan");
	}
}
class Canara extends Loan{
	public void homeloan() {
		System.out.println("Home loan by Canara bank");
	}
}
class SBI extends Loan{
	public void homeloan() {
		System.out.println("Home loan by SBI");
	}
}
class Hdfc extends Loan{
	public void homeloan() {
		System.out.println("Home loan by HDFC bank");
	}
}
class Person{
	void applyforloan(Loan ref) 
	{
		ref.homeloan();
	}
}

public class Day3901 {
	public static void main(String[] args) {
		Person p=new Person();
		p.applyforloan(new Canara());
		p.applyforloan(new SBI());
		p.applyforloan(new Hdfc());
	}

}
