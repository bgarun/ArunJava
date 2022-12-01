package com.qspider.polymorphism;

class Sample1{
	int a=56;
}
class Sample2 extends Sample1{
	void test() {
		System.out.println("test...");
	}
	void run() {
		System.out.println("run...");
	}
}
class Sample3 extends Sample2{
	boolean res=true;
}
public class Day3702 {
public static void main(String[] args) {
	Sample3 s3=new Sample3();
	System.out.println("a="+s3.a);
	s3.test();
	s3.run();
	System.out.println("res="+s3.res);
	Sample2 s2=s3;
	System.out.println("a="+s3.a);
	s3.test();
	s3.run();
	Sample1 s1=s2;
	System.out.println("a="+s3.a);
	Object ob=s1;
	
}
}





















