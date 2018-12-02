package org.apex.main;

public class BasicCalc {

	public static double display(int x, double a, double b) {
		double res = 0;
		
		switch (x) {
		
		case 1:
			res = a+b;
			break;
			
		case 2:
			res= a-b;
			break;
		case 3:
			res = a*b;
			break;
		case 4:
			if (b!=0) {
				res = a/b;
			}
			else {
			System.out.println("Divisor cannot be 0!");
			}
			break;
		default:
			
			System.out.println("Thankyou!");
		}

		return res;
	}
}
