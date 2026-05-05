package com.javaprograms;

import java.util.Scanner;

public class TestIfConditions {

	public static void main(String[] args) {
        System.out.println("Enter the AGE");
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int age = 18;
        
        if (age>=18) 
        	System.out.println ("you are eligible");
        
        	else 
        		System.out.println("you are not eligible");
        
	}

}
