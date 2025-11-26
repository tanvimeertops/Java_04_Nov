package com.oops;

import java.util.Scanner;

/*
 * Array :store multiple data of same type
 */
public class ArraySingleDeim {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] a=new int[5];
	int[] b = {8,2,1,4,5};//length=5 0-4
//	for (int i = 0; i < a.length; i++) {
//		System.out.println("enter value:");
//		a[i]=sc.nextInt();
//	}
//	
//	for (int i = 0; i < a.length; i++) {
//		System.out.println(a[i]);
//	}
	
//	System.out.println(b[0]);
	
	//selection sort
	for (int i = 0; i < b.length; i++) {
		for (int j = i+1; j < b.length; j++) {
			if(b[i]>b[j]) {
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
	
	System.out.println("sorted array:");
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
	
	/*
	 * fix number : O(1)
	 * n number :O(N)
	 * 2 loop :O(N^2)
	 * halving: O(logn)
	 * O(NxM)
	 */
	
	System.out.println("TC of log N");
	int i=50;
	while(i>0) {
		i/=2;
		System.out.println(i);
		i--;
	}
}
}
