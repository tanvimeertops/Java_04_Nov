package com.oops;
/*
 * Polymorphism
 * function overriding:same function name, return type and 
 * 
 * body may be different
 * 
 * keyword :super : calls the function of immediate parent
 */
class A{
	public A() {
		System.out.println("this is constrctor A");
	}
	public void show() {
		System.out.println("In A show");
	}
}
class B extends A{
	public B() {
		System.out.println("this is constrctor B");
	}
	public void show() {
		super.show();
		System.out.println("In B show");
	}
}
class C extends B{
	public C() {
		System.out.println("this is constrctor C");
	}
	public void show() {
		super.show();
		System.out.println("In C show");
	}
}
public class ConstrcutorChaining {
public static void main(String[] args) {
	C c=new C();
	c.show();
}
}
