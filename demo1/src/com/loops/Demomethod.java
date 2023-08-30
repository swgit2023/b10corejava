package com.loops;

public class Demomethod {
//static method

	static int a = 10;
	int b = 5;

	// non static

	public void test1() {
		System.out.println("Hey iam not static method");

	}

	public void test2() {
		System.out.println("hey iam static");

	}

	// non void type method
	public String test3() {
		System.out.println("im non void type method");
		return "hello";

	}

	public static void main(String args[]) {
		System.out.println(a);
		Demomethod ss = new Demomethod();
		System.out.println(ss.b);
		ss.test1();
		ss.test2();
		ss.test3();

	}
}
