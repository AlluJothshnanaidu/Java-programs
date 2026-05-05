package com.pattern;
//output
//    1
//   222
//  33333
// 4444444
//555555555

public class StarPattern22 {

	public static void main(String[] args) {
      int i,j,k,star=1,space=4;
      for(i=1;i<=5;i++) {
    	  for(j=1;j<=space;j++) {
    		  System.out.print(" ");
    	  }
    	  for(k=1;k<=star;k++) {
    		  System.out.print(i);
    	  }
    	  star = star+2;
    	  space = space-1;
    	  System.out.println();
      }
	}

}
