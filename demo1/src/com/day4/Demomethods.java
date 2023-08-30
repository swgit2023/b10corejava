package com.day4;

public class Demomethods {
	
	//all type mehods
	
	public void testLogin(String username,String password) {
		System.out.println("Enter username:" +username); 
		System.out.println("Enter passwoed:" +password);
		
			
		}
	
	
	
	
	
	public static void main(String args[]) {
		Demomethods dm = new Demomethods(); 
		dm.testLogin("java","selenium");
	}
}

