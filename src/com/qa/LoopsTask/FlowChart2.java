package com.qa.LoopsTask;

// a = 100
// if a%2 = 0 print -
// else print *
// a++
// do this while a <= 200
// once greater than 200 end the loop

public class FlowChart2 {

	
	public static void main(String[] args) {
		function2();
	}

	public static void function2() {
		for(int a = 100; a <= 200; a++)	{
			if (a % 2 == 0) {
				System.out.println(a + ". -");
			} 
			else {
				System.out.println(a + ". *");
		}
						
		
		}
		System.out.println("End");
	}
	
}
	
