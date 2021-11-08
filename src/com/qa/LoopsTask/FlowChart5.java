package com.qa.LoopsTask;

// create a method to print 1-10 as many times as the number
// eg 1 print 1 time
// 	  10 print 10 times

public class FlowChart5 {

	public static void main(String[] args) {
		function5();
	}

	public static void function5() {

		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.println(i);
			}

		}

	}
}
