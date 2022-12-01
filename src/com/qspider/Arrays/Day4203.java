package com.qspider.Arrays;



public class Day4203 {
public static void main(String[] args) {
	int[]ar= {23,56,85,78,41};
	System.out.println(ar.length);
	int res=0;
	 for(int i=0; i<ar.length; i++) {
		 System.out.println(ar[i]);
		 res=res+ar[i];
	 }
	 System.out.println(res);
	 
	 
	 int[]b= {1,3,5,7,9,11};
	 System.out.println(b[0]);
	 System.out.println(b.length);
	 int cum=0;
	 for(int i=0;i<b.length;i++) {
		 //System.out.println(b[i]);
		 cum=cum+b[i];
		 System.out.println(cum);
	 }
}
}
