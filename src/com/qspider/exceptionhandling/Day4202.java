package com.qspider.exceptionhandling;

//creating own exception
class BlocedException extends Exception{
	
}
class Corejava{
	void learning(boolean interactive) throws BlocedException{
	if(interactive==true) {
		System.out.println("placment help");
	}
	else {
		throw new BlocedException();
	}
	}
}

public class Day4202 {
public static void main(String[] args) {
	Corejava cj=new Corejava();
	try {
	cj.learning(false);
}
	catch (BlocedException e) {
	 e.printStackTrace();
		
	}
	}
}
