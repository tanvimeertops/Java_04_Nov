package com.oops;

import java.util.Scanner;

/*
 * Scanner class is used to take input from the user
 */
public class ScannerDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	int a;
	System.out.println("Enter Integer value:");
	a=sc.nextInt();
	System.out.println(a);
	float b;
	System.out.println("Enter float value:");
	b=sc.nextFloat();
	System.out.println(b);
	char ch;
	System.out.println("Enter Char value:");
	ch=sc.next().charAt(0);
	System.out.println(ch);
	
	String str;
	System.out.println("enter string value:");
	str=sc.next();//reads upto space
	System.out.println(str);
	
	String str1;
	System.out.println("enter string value:");
//	sc.nextLine();//buffer clean
	str1=sc1.nextLine();//reads upto enter
	System.out.println(str1);
}
}
