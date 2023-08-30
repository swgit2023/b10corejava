package com.controlstatements;

public class Demoifelseif {
	public static void main(String args[]) {
		// if marks less than 35 -fail
		// 35 to 60 pass
		// 60 to100-first clas
		int marks = 61;
		if (marks < 35) {
			System.out.println("fail");
		} else if (marks < 60 && marks > 35) {
			System.out.println("pass");
		} else {
			System.out.println("first class");
		}
	}

}
