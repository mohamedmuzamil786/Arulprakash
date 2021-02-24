package org.Java;

public class Sample {
	
	
	public static void factorial(int n) {
		int q = 0; int res = 1;
		n=q;
		
		while (q>0) {
			
			res =res*q;
			q=q-1;
			
		}
		
		
		System.out.println(res);
		
	}

	public static void main(String[] args) {
		
		
		factorial(5);
		
		
		
	}
}
