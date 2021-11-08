package com.qa.LoopsTask;

//While a <= 200 print a and increment
//End when over 200

public class FlowChart {

	public static void main(String[] args) {
		function();
	}

	public static void function() {
		int a = 100;
		while (a <= 200) {
			System.out.println("A is: " + a);
			a++;
		}
		System.out.println("End");
	}
}
