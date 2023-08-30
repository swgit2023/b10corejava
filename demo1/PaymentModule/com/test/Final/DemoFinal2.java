package com.test.Final;

public class DemoFinal2 extends DemoFinal1{
	

String city = "hyd"; 

 public void testhome() {
	 System.out.println("this is public method");
	 
 }
 public static void main(String args[]) {
	 DemoFinal2 df2 = new DemoFinal2();
	 System.out.println(df2.city);
	 
	 System.out.println(df2.name);
	 df2.testLogin();
	 df2.testhome();
 }

 
}
