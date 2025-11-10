package com.basic;
/*
 * Type conversion
 * convert one primitive type to another
 * Implicit conversion(automatic): 
 * convert smaller datatype to bigger
 * Explicit conversion
 */
public class TypeConversion {
public static void main(String[] args) {
	int i1=56;
	long l1=i1;
	System.out.println("long is "+l1);
	float f1=566.78989f;
	double d1=f1;
	System.out.println("implicit conversion is "+d1);
	byte b1=127; //1
	int i2=b1; 
	System.out.println("implicit conversion is "+i2);
	
	int i3=(int)l1;
	System.out.println("explicit conversion is "+i3);
	
	int i4=512;//-128 -127 to 127
	byte b2=(byte)i4;
	System.out.println("explicit conversion is "+b2);
}
}
