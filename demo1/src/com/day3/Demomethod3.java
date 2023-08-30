package com.day3;

public class Demomethod3 {
	public int testSum() {
		// non static type method.return type method.

		int a = 30;
		int b = 20;
		System.out.println("Hey im non void type method");
		int sum = a + b;
		return sum;
	}

	public void test5() {
		int marks = 35;
		if (marks >= 35) {
			System.out.println("pass");

		}

	}

	public static void main(String args[]) {
		Demomethod3 ss = new Demomethod3();
		int total = ss.testSum();
		System.out.println("total value " + total);
		ss.test5();

	}
}
