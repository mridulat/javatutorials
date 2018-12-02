package org.apex.main;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first operand:\t");
		double a = input.nextDouble();
		
		System.out.println("Enter second operand:\t");
		double b = input.nextDouble();	
		
		System.out.println("Please enter the choice of operation :\n"
				+ "1. Add\n"
				+ "2. Subtract \n"
				+ "3. Multiply \n"
				+ "4. Divide \n");
		int choice = input.nextInt();
		
		System.out.println(BasicCalc.display(choice, a, b));
		
	}

}
