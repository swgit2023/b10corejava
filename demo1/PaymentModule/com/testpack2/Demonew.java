package com.testpack2;

import com.testpack1.DemoDefault;

public class Demonew {

	public static void main(String args[]) {
		DemoDefault dc = new DemoDefault();

		String str1 = dc.name;
		System.out.println("String value :" + str1);

		dc.test1();

		dc.test2();

		dc.test();
	}

}
