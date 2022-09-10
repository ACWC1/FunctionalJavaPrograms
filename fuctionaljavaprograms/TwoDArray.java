package com.fuctionaljavaprograms;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		System.out.println("Welcome to 2 D Array Program");
		Scanner scanner = new Scanner(System.in);
		int M = 0;
		System.out.print("Enter number of rows : ");
		M = scanner.nextInt();
		int N = 0;
		System.out.print("Enter number of columns : ");
		N = scanner.nextInt();
		System.out.println("You have to enter "+M+" * "+N+" matrix");

		int[][] array = new int[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("Enter value for "+i+" * "+j+" : ");
				array[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println("");
		}
		scanner.close();
	}

}
