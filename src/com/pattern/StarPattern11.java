package com.pattern;

import java.util.Scanner;

//output = 5
//*   *
// * * 
//  *  
// * * 
//*   *
public class StarPattern11 {

	public static void main(String[] args) {
	System.out.println("enter the number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
       for(int i=1;i<=n;i++) {
    	   for(int j=1;j<=n;j++) {
    		   if(i == j|| i+j == n+1) {
    			   System.out.print("*");
    		   }else {
    			   System.out.print(" ");
    		   }
    	   }
    	   System.out.println();
       }
       sc.close();
	}

}
