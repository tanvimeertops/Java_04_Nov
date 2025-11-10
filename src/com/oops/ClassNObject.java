package com.oops;

import java.security.Identity;

/*
 * class:blue print
 * collection data member and member function
 *  
 * object :gives permission to access the functionality of class
 */
class Student{
	int id;
	String name;
	
	public void setData() {
		id=123;
		name="ruchit";
	}
	public void show() {
		System.out.println("id is :"+id);
		System.out.println("name is :"+name);
	}
}
public class ClassNObject {
public static void main(String[] args) {
	Student s1=new Student();
	s1.setData();
	s1.show();
}
}
