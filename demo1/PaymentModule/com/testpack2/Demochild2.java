package com.testpack2;

import com.testpack1.DemoDefault;
import com.testpack1.Demochild1;
 

	public class Demochild2 extends DemoDefault{
		  
		
		public static void main(String args[]) {
			Demochild2 dc = new Demochild2();
			
			String str1 =dc.name;
			System.out.println("String value :"  +str1);
		
			dc.test1();
			
			dc.test2();
			
			dc.test();
		}	

}
