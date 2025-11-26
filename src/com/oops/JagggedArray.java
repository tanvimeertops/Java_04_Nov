package com.oops;

import java.util.Scanner;

/*
 * jagged array :same like 2d array
 * 
 * 1 2 3
 * 1
 * 1 2 3 4 5
 * 1 2
 * 
 */
public class JagggedArray {
public static void main(String[] args) {
	int nrow;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter no of row:");
	nrow=sc.nextInt();
	
	int[][] a=new int[nrow][];
	
	for (int i = 0; i < a.length; i++) {
		System.out.println("Enter no of col in row no: "+i);
		a[i]=new int[sc.nextInt()];
		
	}
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=j+1;
		}
		
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]);
		}
		System.out.println();
		
	}
}
}
