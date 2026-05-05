package com.javaprograms;

import java.util.Scanner;

public class HappyNumber {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("enter A Number");
			int n = sc.nextInt();

			int sum = n;
			int r = 0;
			while (n > 9) {
				
				int temp = n;// first copy original value


				sum=0;//then reset it
				while (temp > 0) {
					r = temp % 10;

//				sum+=temp%10;
					temp = temp / 10;
					sum = sum + r;

				}
				n=sum;
			}
			if (sum == 1) {
				System.out.println("magic number");
			} else {
				System.out.println("not magic");
			}

		}
	}


