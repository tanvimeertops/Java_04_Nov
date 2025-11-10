package com.basic;

public class SwitchyCase {
public static void main(String[] args) {
	char ch='-';
	int a=10,b=5;
	switch (ch) {
	case '+':
		System.out.println(a+b);
		break;
	case '-':
		System.out.println(a-b);
		break;
	case '*':
		System.out.println(a*b);
		break;
	case '/':
		System.out.println(a/b);
		break;
	case '%':
		System.out.println(a%b);
		break;
	default:
		break;
	}
}
}
