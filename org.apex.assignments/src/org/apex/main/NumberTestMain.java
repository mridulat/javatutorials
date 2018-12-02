package org.apex.main;

import java.util.Scanner;

public class NumberTestMain {
	public static void main(String[] args) {
		System.out.println("Enter input to test for Integer: \t");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		
		System.out.println((NumberTest.isInteger(word))? "It is an Integer":
				"Not an Integer");
		
		if(NumberTest.isInteger(word)==true) {
			System.out.println("Enter a number to test for Odd: \t");
			int num = input.nextInt();
			System.out.println(NumberTest.isOddNumber(num)? "It is an Odd number":
				"It is not an Odd number");
			
			System.out.println("Enter a number to test for Even: \t");
			num = input.nextInt();
			System.out.println(NumberTest.isEvenNumber(num)? "It is an Even number":
					"It is not an Even number");	
			
			System.out.println("Enter a number to test for Prime: \t");
			num = input.nextInt();
			System.out.println(NumberTest.isPrimeNumber(num)? "It is a Prime number":
					"It is not a Prime number");	
		}
	}

}
