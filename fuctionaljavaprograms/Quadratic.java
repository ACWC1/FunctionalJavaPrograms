package com.fuctionaljavaprograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
		double delta = 0;
		double root1 = 0;
		double root2 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please Enter the Value of A, B, and C : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(" Value of A : "+a+" Value of B : "+b+" value of C  : "+c);
		
		delta = (Math.pow(b, 2) - 4 * a * c);
		if (delta < 0) {
			System.out.println(" Delta is : "+delta);
			System.out.println(" Unable to find the Roots delta is Negitive value !!");
		}
		else {
			root1 = (-b + Math.sqrt(delta)/(2 * a));
			System.out.println(" Root 1 of X : "+root1);
			
			root2 = (-b - Math.sqrt(delta)/(2 * a));
			System.out.println(" Root 2 of X : "+root2);
		}
		sc.close();
	}

}
