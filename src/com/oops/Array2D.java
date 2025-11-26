package com.oops;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 * 2D array :row and col
 */
public class Array2D {
public static void main(String[] args) {
	int[][] a=new int[2][3];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j <a[i].length; j++) {
			System.out.print("  |  "+j+1);
		}
		System.out.println();
	}
	
}
}
