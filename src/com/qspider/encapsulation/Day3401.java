package com.qspider.encapsulation;

class Pan {
private String name;
private String pancard;
private String DOB;
Pan(String name, String pancard, String DOB){
	this.name=name;
	this.pancard=pancard;
	this.DOB=DOB;
}
public void setName(String name) {
	System.out.println("generate otp and validated");
	this.name=name;
}
public void setPancard(String pancard) {
	System.out.println("generate otp and validated");
	this.pancard=pancard;
}
public void setDOB(String DOB) {
	System.out.println("generate otp and validated");
	this.DOB=DOB;
}
public String getName() {
	System.out.println("generate otp and validated");
	return name;
}
public String getPancard() {
	System.out.println("generate otp and validated");
	return pancard;
}
public String getDOB() {
	System.out.println("generate otp and validated");
	return DOB;
}
}
class Day3401{
	public static void main(String[] args) {
	Pan p=new Pan("Arun", "1254QE25", "26/10/1994");
	System.out.println(p.getName());
	System.out.println(p.getPancard());
	System.out.println(p.getDOB());
	p.setName("Arun B");
	p.setDOB("26/11/1994");
	System.out.println(p.getName());
	System.out.println(p.getPancard());
	System.out.println(p.getDOB());
	}
}

