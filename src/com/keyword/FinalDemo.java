package com.keyword;
/*
 * Final : value is constant
 * variable:
 * must give value at declaration time
 * cannot change value at runtime or compile time
 * method : cannot override final method
 */
class FDemo{
	final int roll_no=45;
	final String app_name="Tops Tchnologies";
	public final void show() {
		System.out.println("roll no  is"+roll_no);
	}
}
//class Demo extends FDemo{
//	
//}
public class FinalDemo {
public static void main(String[] args) {
	FDemo fd=new FDemo();
//	fd.app_name="R&W";
	fd.show();
}
}
