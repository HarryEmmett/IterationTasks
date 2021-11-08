package com.qa.LoopsTask;

import java.util.Scanner;

//Given a cost and an amount, work out the change given in specific coins.
//eg £4.58 cost and the customer pays with £20 they should receive: 1 £10, 1 £5, 2 20p, 1 2p. Equalling £15.42  

public class CoinsTask {

	public static void main(String[] args) {

		coinsTask();

	}

	public static int changeneeded(int totalcash, int pruchaseprice) {
		return totalcash - pruchaseprice;
	}

	public static void coinsTask() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter total cash: ");
		int total = scanner.nextInt();

		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Enter total price of purcahse: ");
		int price = scanner.nextInt();

		System.out.println("Cash returned: ");

		int a = changeneeded(total, price);
		while (a > -1) {
			if (a >= 20) {
				a = a - 20;
				System.out.println("£" + 20);
			} 
			
			else if (a >= 10) {
				a = a - 10;
				System.out.println("£" + 10);
			} 
			
			else if (a >= 5) {
				a = a - 5;
				System.out.println("£" + 5);
			} 
			
			else if (a >= 2) {
				a = a - 2;
				System.out.println("£" + 2);
			} 
			
			else if (a >= 1) {
				a = a - 1;
				System.out.println("£" + 1);
			} 
			
			else if (total == price) {
				System.out.println("£0 No change given!");
				break;
			
			}
		}
	
	}
}
