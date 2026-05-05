package com.arrays;
//Write a Java program to perform the following operations on a matrix.
//1.	If row index is even → Reverse the row (i % 2 == 0)
//2.	If row index is odd → Double the elements(i % 2 != 0) 
//3.	Square diagonal elements(i == j) 
//Input:        1 2 3                                  output :      9  2  1
//              4 5 6                                                8  25 12
//              7 8 9                                                9  8  49
public class EvenOddSquare {

	public static void main(String[] args) {          
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        
        for( int i=0;i<arr.length;i++) {
        	if(i%2==0) {
        		for(int j=0;j<arr.length;j++) {
        			if(j<arr.length/2) {
        				
        			
        			
      		   int temp = arr[i][j];
      		  arr[i][j]=arr[i][arr.length-1-j];
      		  arr[i][arr.length-1-j]=temp;
      		  
      	  }
        		
        		if(i==j) {
        			arr[i][j]=arr[i][j]*arr[i][j];
        		}
        		
        		}
        	}
        	else {
        		for(int j=0;j<arr.length;j++) {
        			if(i==j) {
            			arr[i][j]=arr[i][j]*arr[i][j];
            		}else {
            			arr[i][j]=arr[i][j]*2;
            		}
        		}
        	}
        	
        }
	 
        	
        for(int[] num:arr) {
        	for(int num1:num) {
        		System.out.print(num1+" ");
        	}
        	System.out.println();
        	
        }
        }
}   	
        

//for(int i=0;i<=2;i++) {
//	for(int j=0;j<=2;j++) {
//		if(i%2==0) {
//
//			int start=0;
//			int end=arr.length-1;
//			while(start<end) {
//			int temp=arr[i][end];
//			arr[i][end]=arr[i][start];
//			arr[i][start]=temp;
//			start++;
//			end--;
//		}
//	
//	}
//		System.out.print(arr[i][j]+ " ");
//	
//}
//	
//	System.out.println();
//}



