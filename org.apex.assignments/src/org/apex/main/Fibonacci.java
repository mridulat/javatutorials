package org.apex.main;

public class Fibonacci {

	public static void display(int y) {
		// TODO Auto-generated method stub
		int z[]= new int[y];
		for (int x=0;x<y;x++) {

			if(x>1) {
				z[x]= z[x-1]+ z[x-2];
			}
			else {
				z[x] = x;
			}
			
			System.out.println(z[x]);
		}
	}

}
