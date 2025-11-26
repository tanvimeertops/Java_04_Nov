package com.keyword;
/*
 * This :current class context
 */
class Student_11{
	int roll_no;
	String name;
	
	public void setData(int roll_no,String name) {
		this.roll_no=roll_no;
		this.name=name;
	}
	
	public void showData() {
		System.out.println("roll no is :"+roll_no);
		System.out.println("name is :"+name);
	}
}

public class ThisDemo {
public static void main(String[] args) {
	Student_11 s11=new Student_11();
	s11.setData(12, "Ruchit");
	s11.showData();
}
}
