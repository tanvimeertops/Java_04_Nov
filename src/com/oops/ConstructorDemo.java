package com.oops;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 * constructor: special member function
 * 1. same name as class name
 * 2. no return type
 * 3. automatically invoked whenever object is created
 */
class Box{
	double length,height,width;
	
	
	public Box() {
		System.out.println("this is default constructor");
		length=1;
		height=2;
		width=3;
	}
	
	public Box(double l,double h,double w) {
		System.out.println("this is parameter constructor");
		length=l;
		height=h;
		width=w;
	}
	public void volOfBox() {
		System.out.println("volume of box is :"+(length*height*width));
	}
}
public class ConstructorDemo {
public static void main(String[] args) {
	Box dc=new Box();
	dc.volOfBox();
	Box pc=new Box(10,20,30);
	pc.volOfBox();
}
}
