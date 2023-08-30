package com.test.oops;

public class SubclassDemo extends DemoInheritance {
	String course = "java";

	public void test2() {
		System.out.println("this is test2  method");

	}

	public static void main(String args[]) {
		SubclassDemo scd = new SubclassDemo();

		scd.test();
		scd.test2();
		System.out.println(scd.name);
		System.out.println(scd.course);
	}
}
