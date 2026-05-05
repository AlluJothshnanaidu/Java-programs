package com.javaprograms;

import java.util.Scanner;

public class TestIfConditions2 {

	public static void main(String[] args) {
      System.out.println("enter the number");
      Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       
       if(num > 0) {
    	   System.out.println("positive");
       }
       else if (num < 0) {
    	   System.out.println("negative");
       }
       else {
    	   System.out.println("zero");
       }
	}

}
