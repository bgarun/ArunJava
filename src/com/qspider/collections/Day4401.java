package com.qspider.collections;



import java.util.ArrayList;
//import java.util.Iterator;

public class Day4401 {
	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<Object>();
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
