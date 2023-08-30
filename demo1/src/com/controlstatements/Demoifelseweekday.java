package com.controlstatements;

public class Demoifelseweekday {
	public static void main(String args[]) {
		String day = "sunday";

		if (day == "monday")
			System.out.println("today is working day");
		else if (day == "tuesday") {
			System.out.println("today is working day");
		} else if (day == "wednesday") {
			System.out.println("today is working day");
		} else if (day == "thursday") {
			System.out.println("today is working day");
		} else if (day == "friday") {
			System.out.println("today is working day");
		} else if (day == "saturday") {
			System.out.println("today is working day");
		} else if (day == "sunday") {
			System.out.println("today is holiday");
		} else {
			System.out.println("please enter valid day");

		}
	}
}
