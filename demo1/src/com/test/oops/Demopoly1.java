package com.test.oops;

public class Demopoly1 {

public void game (String g , int a) {
	 System.out.println("my game name is : "  + g +": "+ a);
}

public void game(int g,String a) {
	 System.out.println("players court :" + g +": " + a);
}
public static void main(String args[]) {
	Demopoly1 dp = new Demopoly1();
	dp.game("kabadi",6);
	dp.game(6,"football");
	
}
}
