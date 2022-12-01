package com.qspider.polymorphism;

class landline{
	void call() {
		System.out.println("call");
	}
	
}
class Mobile extends landline
{
void playmusic() {
	System.out.println("play Music");
}	
}
public class Day3701 {
	public static void main(String[] args) {
		Mobile m1= new Mobile();
		m1.call();
		m1.playmusic();
		landline l1=m1;
		l1.call();
	}

}
