package com.pattern;

public class StarPattern19 {
//OUTPUT
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *

	public static void main(String[] args) {
      int i,j,k,star=1,space =4;
      for(i=1;i<=9;i++) {
    	  for(j=1;j<=space;j++) {
    		  System.out.print(" ");
    	  }
    		  for(k=1;k<=star;k++) {
    			  System.out.print("*");
    		  }
    		  if(i<5) {
    			  star=star+2;
    			  space=space-1;
    		  }else {
    			  star=star-2;
    			  space=space+1;
    		  }
    		  System.out.println();
    	  }
    	  }
      }
	


