package com.day4;

public class Democonstructer1 {
	//this is called a constructers non argument constructer
	public Democonstructer1() {
		System.out.println("this is constructer");
		
	}
	public Democonstructer1(String username1, String password1) {
		System.out.println("this is method." 
 + password1);
	}
	public static  void Login() {
		System.out.println("this is method");
		
	}
	public static void testLogin(String username , String password) {
		System.out.println("this is method." 
 + password);
		
	}
      public static void main(String args[]) {
    	  Democonstructer1 obj = new Democonstructer1();
    	  Login();
    	  
    	  testLogin("admin","admin123");

    	  
      }
}
