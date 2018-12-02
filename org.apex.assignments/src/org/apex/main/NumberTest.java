package org.apex.main;

public class NumberTest {
	public static boolean isInteger(String word) {
		try {
			Integer.parseInt(word);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean isOddNumber(int num) {
		if(num % 2 !=0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isEvenNumber(int num) {
		if (num %2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrimeNumber(int num) {
		int count =0;
		for(int divisor=2;divisor<num; divisor++) {
			
			if(num%divisor == 0) {
				count+=1;
			}
		}
		
		if (count!=0) {
			return false;
		}
		else {
			return true;
		}
	}
}
