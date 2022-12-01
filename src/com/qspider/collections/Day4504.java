package com.qspider.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Laptop {
String os;
int ram;
public Laptop(String os, int ram){
	this.os=os;
	this.ram=ram;
String toString() 
{
		return os+" "+ram;
	}

}
}
class Mobile {
String model;
int memory;
public Mobile(String mod, int mem){
	this.model=mod;
	this.memory=mem;
	public String toString() {
		return model+" "+memory;
	}
}
}

public class Day4504 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(new Laptop("windows", 64));
	a1.add(new Mobile("Samsung", 128));
	a1.add(new Laptop("windows 11", 128));
	a1.add(new Mobile("Galacy", 64));
	a1.add(new Laptop("windows 10", 32));
	System.out.println(a1.size());
	for(int i=0; i<=a1.size(); i++) {
	Object ob=a1.get(i);
	System.out.println(ob);
}
}
}
