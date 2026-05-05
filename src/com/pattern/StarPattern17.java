package com.pattern;
//output
//     *
//    ***
//   *****
//  *******
// *********
//***********

public class StarPattern17 {

	public static void main(String[] args) {
		int i,j,k,star=1,space=5;
       for(i=1;i<=6;i++) {
    	   for(j=1;j<=space;j++) {
              System.out.print(" ");
    	   }
    	   for(k=1;k<=star;k++) {
    		   System.out.print("*");
    	   }
    	   star=star+2;
    	   space=space-1;
    	   System.out.println( );
       }
	}

}
