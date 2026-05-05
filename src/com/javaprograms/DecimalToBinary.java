package com.javaprograms;

import java.util.Scanner;

//write a program to convert decimal number into binary code
//without using any predefined methods.
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int num = sc.nextInt();
		 int binary = 0;
		 int place = 1;
		 
		 while(num >0) {
			 int r = num % 2;//get remainder = Number ni 2 tho divide chesinapudu vache remainder teskuntundi and adhe binary didgit avutundi.
			 binary = binary +(r * place);//remainder ni saraina place value tho multiply chesi binary number lo add chestundi.
			 num = num / 2;   //number ni 2 tho divide chesi next step ki vheltundi.
			 place = place *10;//next binary digit kosam place value change chestundi.
		 }
		
		 System.out.println("binary number : "+binary);									
	}

}
