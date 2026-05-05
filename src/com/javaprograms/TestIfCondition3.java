package com.javaprograms;

import java.util.Scanner;

public class TestIfCondition3 {

	public static void main(String[] args) {
       System.out.println("enter the number");
       Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		   
		   if (num % 2 == 0){
			   System.out.println("Even");
		   }
		   else if (num % 2 != 0){
			   System.out.println("odd");
		   }
	}
	}


