package com.day4;

public class DemoConstructer {
	
	
	public DemoConstructer() {
		System.out.println("this is constructer");
	}
	 
	
	public static void login() {
		System.out.println("this is method");
		
	}

	
     public static void main(String args[]) {
    	 DemoConstructer obj = new  DemoConstructer();
    	 login();
    	 
     }
}
