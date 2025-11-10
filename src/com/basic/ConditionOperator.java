package com.basic;
/*
 * condition :
 * if :if condition is true : true statement print else nothing
 * if else 
 * nested if
 * else if ladder 
 * switch
 * 
 * Arithmetic operator :
 * +-*%/
 * 
 * relation operator:
 * <,>,<=,>=,==
 * 
 * logical operator:
 * && || !
 */
public class ConditionOperator {
public static void main(String[] args) {
	int a=10;
	if (a<=10) {
		System.out.println("a is smaller than 10");
	}
	
	int x=45,y=56;
	if (x>y) {
		System.out.println("x is greater");
	}else {
		System.out.println("y is greater");
	}
		
	System.out.println("sum is :"+(x+y));
	System.out.println("sum is :"+(x-y));
	System.out.println("sum is :"+x*y);
	System.out.println("sum is :"+(float)y/x);
	System.out.println("sum is :"+y%x);
	//12345
	//%10
	
	//even odd
	int no=5;
	if(no%2==0) {
		System.out.println("even no");
	}else {
		System.out.println("odd no");
	}
	
	int p=12,q=60,r=300;
	if(p>q) {
		if (p>r) {
			System.out.println("p is greater");
		}else {
			System.out.println("r is greater");
		}
	}else {
		if (q>r) {
			System.out.println("q is greater");
		}else {
			System.out.println("R is greater");
		}
	}
	
	//greatest of 3 number using logical operator
	
	if(p>q&&p>r) {
		System.out.println("p is greater");
	}else if (q>p && q>r) {
		System.out.println("q is greater");
	}else {
		System.out.println("r is greater");
	}
	
	//grade
	//>70=distinction
	//>60= first
	
	double average=45;
	if (average>=70) {
		System.out.println("Distinction");
	}else if(average>=60) {
		System.out.println("First Class");
	}else if(average>=50) {
		System.out.println("Second Class");
	}else if(average>=35)  {
		System.out.println("Third Class");
	}else {
		System.out.println("Fail");
	}
	
}
}
