package com.javaprograms;

import java.util.Scanner;

public class StrongNmuber1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();

		int temp = num;
		int r = 0;

		int sum = 0;

		while (num > 0) {
			int fact = 1;
			r = num % 10;
			num = num / 10;
			while(r>0) {
				fact*=r--;
			}
           sum=sum+fact;
		}

		if (sum == temp) {
			System.out.println("strong number");
		} else {
			System.out.println("not a strong number");
		}
	}

}
