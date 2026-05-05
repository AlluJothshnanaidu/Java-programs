package com.javaprograms;

import java.util.Scanner;

public class PrimeNumberEvenOrOdd {
	static  boolean isprime(int n) {
		 if(n<0 && n==1) {
			 return false;
		 }
		 for(int i=2;i<n;i++) {
			 if(n%i==0) {
				 return false;
			 }
		 }
		 return true;
	 }
	  


	public static void main(String[] args) {
		System.out.println("enter first Number : ");
	      Scanner sc = new Scanner(System.in);
	      int A = sc.nextInt();
	      System.out.println("enter second number : ");
	      int B = sc.nextInt();
	      int sum = 0;
	      int count=0;
	      
	      for(int i=A;i<=B && count<5;i++) {
	    	 	    	  if(isprime(i)) {
	    		  
	    		  sum =sum+ i;
	    		  count++;
	    	  }
	    	  
	      }
	      
	      System.out.println("sum of primenumbers : "+ sum);
	      
	      if(sum % 2 == 0) {
	    	  System.out.println("This is a Even number"+sum);
	      }
		}

	

	}


