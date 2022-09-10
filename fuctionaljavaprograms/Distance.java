package com.fuctionaljavaprograms;

public class Distance {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[2]);;
		
		double result = 0;
		result = Math.sqrt(Math.pow(x, 2) + Math.pow(y,  2)); 
		System.out.println(" X = "+x+"\n Y = "+y+"\n And the Distance = "+result);
	}

}
