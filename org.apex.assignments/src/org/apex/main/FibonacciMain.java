package org.apex.main;

import java.util.Scanner;

public class FibonacciMain {

	public static void main(String[] args) {
		System.out.println("Enter the limit for fibonacci series to be displayed");
		Scanner input = new Scanner(System.in);
		int y = input.nextInt();
		while(y<=0) {
			
			System.out.println("Thats an invalid entry!Please Try again!");
			input = new Scanner(System.in);
			y = input.nextInt();
		} 
		Fibonacci.display(y);
	}
}
