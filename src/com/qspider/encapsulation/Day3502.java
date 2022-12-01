package com.qspider.encapsulation;

class Account {
private String name;
private int balance;
private long accountno;
Account(String name, int balance, long accountno){
	this.name=name;
	this.balance=balance;
	this.accountno=accountno;
}
public void setname(String name) {
	System.out.println("generate otp and validated");
	this.name=name;
}
public void setbalance(int balance) {
	System.out.println("generate otp and validated");
	this.balance=balance;
}
public String getname() {
	System.out.println("generate otp and validated");
	return name;
}
public int getbalance() {
	System.out.println("enter pin and validated");
	return balance;
}
public long getaccountno() {
	System.out.println("generate otp and validated");
	return accountno;
}
}
class Day3502{
	public static void main(String[] args) {
	Account ac=new Account("Arun", 1000, 28564782564l);
	System.out.println(ac.getname());
	System.out.println(ac.getbalance());
	System.out.println(ac.getaccountno());
	ac.setname("Arun B");
	ac.setbalance(2000);
	System.out.println(ac.getname());
	System.out.println(ac.getbalance());
	System.out.println(ac.getaccountno());
	}
}
