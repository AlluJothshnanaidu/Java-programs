package com.javaprograms;

import java.util.Scanner;

public class PrimeNumberRange {
	
	
	public static void main(String[] args) {
      System.out.println("enter first Number : ");
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      System.out.println("enter second number : ");
      int B = sc.nextInt();
      int sum = 0;
      
      for(int i=A;i<=B;i++) {
    	  boolean isprime = true;
    	  
    	  if(i<2) {
    		  isprime = false;
    	  }
    	  for(int j=2;j<i;j++) {
    		  if(i%j==0) {
    			  isprime = false;
    			  break;
    		  } 
    		  
    	  }
    	  if(isprime) {
    		  System.out.println(i);
    		  sum += i;
    	  }
    	  
      }
      
      System.out.println("sum of primenumbers : "+ sum);
	}

}
