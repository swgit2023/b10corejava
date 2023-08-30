package com.test.DemoAbstarct;

public class MainDemo extends DemoAbs1 {
	

	public static void main(String args[]) {
		MainDemo md = new MainDemo();
		md.testabs1();
		
		
		md.testabs2();
	     md.testme();
	}	
	//@Override   
	public void testabs1() {
		System.out.println("this is abs 1");
	}
	//@Overr
	public void testabs2() {
		System.out.println("this is abs 2");
		
		
	}

}
