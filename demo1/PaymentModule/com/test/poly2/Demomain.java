package com.test.poly2;

public class Demomain {
 public static void main(String args[]) {
	 Derived d1 = new Derived();
	 d1.Login();
 
     Base1 d2 = new Derived();
     d2.Login();

     Base1 d3 = new Derived();
     d3.Login();
}
}
