package com.qspider.abstaction;
//Abstraction
interface NewsApp{
	abstract void headline();
	abstract void localnews();
	abstract void international();
}
class Indiantimes implements NewsApp
{
public void headline() {
	System.out.println("Repo rate as headline");
}	
public void localnews() {
	System.out.println("State wise news");
}
public void international() {
	System.out.println("Crude oil, trading and sports");
}
}
class Deccan implements NewsApp
{
	public void headline() {
		System.out.println("Political war in India as headline");
	}	
	public void localnews() {
		System.out.println("Rigional News");
	}
	public void international() {
		System.out.println("Sports, culture and international politics");
	}
}
class News{
	NewsApp online (char select) 
	{
		if (select=='i') {
			return new Indiantimes();
		}
		else {
			return new Deccan();
		}
	}
}
public class Day3903 {
public static void main(String[] args) {
	System.out.println("User");
	News n1=new News();
	NewsApp ref =n1.online('m');
	ref.headline();
	ref.localnews();
	ref.international();
	//Accessing Deccan class
	NewsApp ref1 =n1.online('d');
	ref1.headline();
	ref1.localnews();
	ref1.international();
}
}
