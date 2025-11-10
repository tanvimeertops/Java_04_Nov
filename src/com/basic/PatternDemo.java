package com.basic;
/*
 * ****
 * ****
 * ****
 * 
 * 
 * for i
 * step 1 initialization :
 * first number in pattern
 * last number in pattern
 * 
 * step 2 condition
 * min to max : <= ++
 * max to min :>= --
 * 
 * for j:
 * step 1 initialization :
 * first row of each col
 * step 2 condition
 * same no : write that no 
 * diff no : upper loop name
 * last no of each row
 * same no : write that no 
 * diff no : upper loop name
 * 
 * incree/decree:
 * min to max  <= ++
 * max to min  >= --
 * 
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * 5
 * 45
 * 345
 * 2345
 * 12345
 * 
 * 
 */
public class PatternDemo {
public static void main(String[] args) {
//	for (int i = 1; i <=3; i++) {
//		for (int j = 1; j <=4; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
/*
 * 5
 * 45
 * 345
 * 2345
 * 12345
 * 
 * 5
 * 54
 * 543
 * 5432
 * 54231
 * 
 * 1
 * 21
 * 321
 * 4321
 * 54321
 * 
 * 1
 * 10
 * 101
 * 1010
 * 10101
 * %2
	 */
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(j%2);
		}
		System.out.println();
	}
}
}
