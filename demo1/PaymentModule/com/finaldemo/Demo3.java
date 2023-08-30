package com.finaldemo;

  final public class Demo3 {
	  
	  String course = "selenium java";
	  
	  
	  void test1() {
		   System.out.println("this is final class method");
	  }
      public static void main(String args[]) {
    	  Demo3 dd = new Demo3();
    	  System.out.println(dd.course);
    	  
    	  dd.test1();
      }
	
}
