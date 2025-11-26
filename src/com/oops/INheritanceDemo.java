package com.oops;
/*
 * Inheritance :deriving attribute of some other class
 * single
 * multilevel
 * hierarchical
 * Encapsulation :wrapping of data 
 * Access specifier
 * private: can access within class
 * protected: can access in child class
 * default :can access within package
 * public :can access anywhere
 * 
 */
class Employee{
	protected int id;
	String name;
	
	public void setData() {
		id=23;
		name="Tops";
	}
}
class INsentives extends Employee{
	double overtime=6787;
	public void show() {
		System
		.out.println("id is :"+id);
		System.out.println("name is :"+name);
		System.out.println("overtime is :"+overtime);
	}
}
public class INheritanceDemo {
public static void main(String[] args) {
	INsentives in=new INsentives();
	in.setData();
	in.show();
}
}
