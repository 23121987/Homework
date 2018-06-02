package com.company;

public class Main {

	public static void main(String[] args) {
		int[][] namber = new int[3][4];
		int namber2 = 1;
		for (int i = 0; i < 3; i++) {
			for (int b = 0; b < 4; b++) {
				namber[i][b] = namber2 ++;

				System.out.print(namber[i][b] + " ");
			}
			System.out.println();
		}
	}
}
