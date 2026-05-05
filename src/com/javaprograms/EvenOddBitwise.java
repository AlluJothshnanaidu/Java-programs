package com.javaprograms;

import java.util.Scanner;

public class EvenOddBitwise {

	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number");
          int num =  sc .nextInt();
          
         String Result = (num & 1) == 0?"even" :"odd";
          System.out.println(Result);
	}

}
