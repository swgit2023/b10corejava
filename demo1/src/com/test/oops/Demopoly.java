package com.test.oops;

public class Demopoly {
 public void game() {
	 System.out.println("this is just game");
 }


public void game (String g) {
	 System.out.println("my game is :" +g);
}


public void game(int g) {
	 System.out.println("players court :" +g);
}
public void game(double g) {
	 System.out.println("game  prize money :" +g);
}
public static void main(String args[]) {
	Demopoly dp = new Demopoly();
	dp.game();
	dp.game(44);
	dp.game("cricket");
	dp.game(11);
}
}