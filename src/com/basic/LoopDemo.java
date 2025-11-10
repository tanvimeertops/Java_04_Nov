package com.basic;
/*
 * loop: repeatative,iterative
 * entry control
 * for
 * while
 * exit control
 * do while
 */
public class LoopDemo {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) { //i=6 6<=5 
		System.out.println(i); //
	}
	
	System.out.println("while loop");
	int i=1; //1
	while(i<=5) {
		System.out.println(i);
		i++;
	}
	
	System.out.println("do while");
	int j=6;
	do {
		System.out.println(j);
		j++;
	} while (j<=5);
}
}
