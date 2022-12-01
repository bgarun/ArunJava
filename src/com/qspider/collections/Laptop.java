package com.qspider.collections;

public class Laptop {
String os;
int ram;
public Laptop(String os, int ram){
	this.os=os;
	this.ram=ram;
public String toString() {
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
