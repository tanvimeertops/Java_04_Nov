package com.keyword;
/*
 * Abstract :
 * class: 
 * 	1.cannot make object of abstract class
 * 	2.must inherit into some other class
 * method:
 * 	1.abstract method cannot have body
 * 	2.must implement into child class
 */
abstract class ADemo{
	public abstract void show();
}
class Demo extends ADemo{

	@Override
	public void show() {
		System.out.println("HEllo");
		
	}
	
}
public class AbstractionDemo {
public static void main(String[] args) {
	Demo aDemo=new Demo();
	aDemo.show();
}
}
