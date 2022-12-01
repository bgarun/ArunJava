package com.qspider.abstaction;

interface Zomato{
	abstract void menu();
	abstract void takeorder();
	abstract void delivery();
}
class Mcdonals implements Zomato
{
public void menu() {
	System.out.println("Burgers");
}	
public void takeorder() {
	System.out.println("thank you for order");
}
public void delivery() {
	System.out.println("Food delivered");
}
}
class Dominos implements Zomato
{
public void menu() {
	System.out.println("Pizza");
}	
public void takeorder() {
	System.out.println("thank you for order");
}
public void delivery() {
	System.out.println("Food delivered");
}
}
class ZomatoApp{
	Zomato online (char select) 
	{
		if (select=='m') {
			return new Mcdonals();
		}
		else {
			return new Dominos();
		}
	}
}
public class Day3902 {
public static void main(String[] args) {
	System.out.println("User");
	ZomatoApp z1=new ZomatoApp();
	Zomato ref =z1.online('m');
	ref.menu();
	ref.takeorder();
	ref.delivery();
}
}
