package com.oops;

class Employee123{
	int id;
	String name;
	
	public void setData() {
		id=23;
		name="Tops";
	}
}
class INsentives123 extends Employee123{
	double overtime=6787;
	
}

class PF extends INsentives123 {
	double pf_balance=788009.990;
	public void show() {
		System
		.out.println("id is :"+id);
		System.out.println("name is :"+name);
		System.out.println("overtime is :"+overtime);
		System.out.println("PF balance :"+pf_balance);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		PF in=new PF();
		in.setData();
		in.show();
	}
}
