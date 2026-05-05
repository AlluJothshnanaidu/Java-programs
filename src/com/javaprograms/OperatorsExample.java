package com.javaprograms;

public class OperatorsExample {

	public static void main(String[] args) {
		System.out.println("***********");
		int x = 3;
		int y = x << 2 + 1;

		System.out.println(y);

		System.out.println("********");
		int x1 = 8;
		int y1 = 2;
		int z = x1 << y1 >> 1;
		System.out.println(z);

		System.out.println("********");
		int x2 = 1;
		int y2 = 2;
		int z1 = 3;

		int z2 = x2 << y2 << z1;
		System.out.println(z2);
	}
}
