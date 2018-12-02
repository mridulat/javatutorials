package org.apex.main;

public class GenerateNum {
	
	public void Generate1000() {
		for(int i =1;i<=1000;i++) {
			System.out.print(i+"\t");
		}
	}
	
	public void GenerateMul5() {
		System.out.println();
		for(int i=1;i<1000;i++) {
			System.out.print(i*5+ "\t");
		}
	}
	
	public void GenerateOdd() {
		System.out.println();
		for(int i=1;i<1000;i+=2) {
			System.out.print(i+"\t");
		}
	}

}
