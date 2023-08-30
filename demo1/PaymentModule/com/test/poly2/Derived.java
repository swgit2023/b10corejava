package com.test.poly2;
//child class
public class Derived extends Base1 {
	//override
	public void Login() {
		System.out.println("this is from base class");
		
	}
	public static void main(String args[]) {
		Derived d1 = new Derived();
		
	}

}
