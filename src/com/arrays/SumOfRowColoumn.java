package com.arrays;

public class SumOfRowColoumn {

	public static void main(String[] args) {
		System.out.println("Rows");
          int [] [] arr = {{1, 2,3},
                       {4, 5, 6},
                       {7, 8, 9}
          };
         
         for (int a[]:arr) {
       	  int sum = 0;
        	  
       	  for(int b:a) {
       		  sum = sum+b;
        		  
       	  }   
  
            System.out.println( sum +"");
         }
         System.out.println("coloums");
         
         
          for (int j = 0; j < arr.length; j++) {
        	  int sum = 0;
        	  
        	  for(int i = 0; i< arr[j].length;i++) {
        		  sum  = sum+arr[i][j];
        	  }  
        	  System.out.println(sum);
      }
	}
	
	

}
