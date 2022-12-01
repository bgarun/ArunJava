package com.qspider.collections;
import java.util.ArrayList;
import java.util.Iterator;




public class Day4501 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(new Laptop("windows", 64));
	a1.add(new Mobile("Samsung", 128));
	a1.add(new Laptop("windows 11", 128));
	Iterator ref=a1.iterator();
	while(ref.hasNext()) {
		Object ob=ref.next();
		System.out.println(ob);
	}
	
	
	
}
}
