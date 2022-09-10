package com.fuctionaljavaprograms;

import java.util.Scanner;

public class TrippletZero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = 0;
		System.out.print("Enter size of array : ");
		N = scanner.nextInt();
		System.out.println("You have to enter "+N+" numbers. ");
		int[] array = new int[N];
		
		for (int i = 0; i < N; i++) {
			
			System.out.println("Enter the value for "+i+" in array : ");
			array[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(array[i]);
		}
		
		int[][] triplets = new int[N*N*N][3];
		int Counter = 0;
		if (N < 3) {
			System.out.println("number of distinct tripltes is 0");
		} else {
			for (int i = 0; i < (N-2); i++) {
				for (int j = i+1; j < (N-1); j++) {
					for (int k = j+1; k < N; k++) {
						if ((array[i] + array[j] + array[k]) == 0) {
							triplets[Counter][0] = i;
							triplets[Counter][1] = j;
							triplets[Counter][2] = k;
							Counter++;
						}
					}
				}
			}
		}
		
		System.out.println("number of distinct tripltes are "+Counter);
		for ( int i = 0; i < Counter; i++) {
			System.out.println("triplets indexes are "+triplets[i][0]+", "+triplets[i][1]+", "+triplets[i][2]+" and triplets values are "+array[triplets[i][0]]+", "+array[triplets[i][1]]+", "+array[triplets[i][2]]);
		}
		scanner.close();
		
	}

}
