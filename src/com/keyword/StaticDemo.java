package com.keyword;
/*
 * static :constant at value side
 * 
 * method:
 * all variables are static by default
 * non static variables are not allowed in static method
 */

class SDemo{
	int i_no;
	static int s_no;
	
	 public static void s_func() {
//		 i_no=85;
		int r_no=34;
		System.out.println("r no is :"+r_no);
	}
}
public class StaticDemo {
public static void main(String[] args) {
	SDemo sd=new SDemo();
	SDemo sd1=new SDemo();
	SDemo sd2=new SDemo();
	sd.i_no=1; //4
	sd1.i_no=2;//4
	sd2.i_no=3;//4
	
	System.out.println("i no for sd :"+sd.i_no);
	System.out.println("i no for sd 1 :"+sd1.i_no);
	System.out.println("i no for sd 2 :"+sd2.i_no);
	
	SDemo.s_no=10;
	SDemo.s_no=20; //4 
	SDemo.s_no=30;
	System.out.println("s no for sd :"+SDemo.s_no);
	System.out.println("s no for sd 1 :"+SDemo.s_no);
	System.out.println("s no for sd 2 :"+SDemo.s_no);
	
	SDemo.s_func();
}
}
