package com.oops;
/*
 * single and multiple child
 */

class Parent{
	String p_name;
	long ph_no;
	public void setParent() {
		p_name="salim khan";
		ph_no=9685741234l;
	}
}

class child1 extends Parent{
	String child_name="salman";
	public void show() {
		System.out.println("for any complain of "+child_name+" "+p_name+" call "+ph_no );
	}
}
class Child2 extends Parent{
	String child_name="suhail";
	public void show() {
		System.out.println("for any complain of "+child_name+" "+p_name+" call "+ph_no );
	}
}


public class HierarchicalDemi {
public static void main(String[] args) {
	child1 c1=new child1();
	Child2 c2=new Child2();
	c1.setParent();
	c1.show();
	c2.setParent();
	c2.show();
	
}
}
