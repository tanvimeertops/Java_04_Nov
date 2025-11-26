package com.oops;
/*
 * Function: does some task
 * function without parameter without return type
 * function with parameter without return type
 * function without parameter with return type
 * function with parameter with return type
 * 
 * polymorphism: 
 * function overloading: function with same name but different parameter
 * function overiding
 */
class Student123{
	int a, b;

	public void sum() {
		a = 20;
		b = 10;
		System.out.println("sum is :" + (a + b));
	}
	
	public void sum(int num1,int num2) {
		a=num1;
		b=num2;
		System.out.println("sum is :" + (a + b));
	}
	
	public double div() {
		a=10;
		b=2;
		return a/b;
	}
	
	public double div(int num1, int num2) {
		a = num1;
		b = num2;
		return a / b;
	}
}

public class FunctionDemo {
	public static void main(String[] args) {
		Student123 student123=new Student123();
	student123.sum();
	student123.sum(34, 23);
	System.out.println(student123.div());
	System.out.println(student123.div(40,5));
}
}
