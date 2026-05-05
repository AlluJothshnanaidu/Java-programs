package com.javaprograms;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt();

		int r = 0;
		int square = n;
		while (square != 1) {
			int sum = 0;
			while (square > 0) {
				r = square % 10;
				square = square / 10;
				sum = sum + r * r;

			}
			square = sum;
		}

		if (square == 1) {
			System.out.println("happy number");
		} else {
			System.out.println("not a happy");
		}

	}
}
