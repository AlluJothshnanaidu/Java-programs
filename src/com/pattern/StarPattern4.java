package com.pattern;
//output
//####
//****
//####
//****

public class StarPattern4 {

	public static void main(String[] args) {
      int i,j;
      for(i=1;i<=4;i++) {
    	  for(j=1;j<=4;j++) {
              if (i%2!=0) {
            	  System.out.print("#");
              } else
              {
            	  System.out.print("*");
              }
              
    	  }
    	  System.out.println( );
      }
	}

}
