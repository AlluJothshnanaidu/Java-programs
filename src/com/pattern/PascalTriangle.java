package com.pattern;
//output:
//	     1
//	    1 1
//	   1 2 1
//	  1 3 3 1
//	 1 4 6 4 1
//  1 5 10 10 5 1
	
public class PascalTriangle {

	public static void main(String[] args) {
            for(int i=0;i<=10;i++) {
            	for(int j=0;j<10-i;j++) {
            System.out.print(" ");
            	}
            	int num=1;
            	for(int k=0;k<=i;k++) {
            		System.out.print(num+" ");
            		num=num*(i-k)/(k+1);
            	}
            		
            System.out.println();
            	}
	}
}

