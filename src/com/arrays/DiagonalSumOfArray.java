 package com.arrays;

// sum of diagonal row and columns
public class DiagonalSumOfArray {

	public static void main(String[] args) {
		System.out.println("diognal sum");
		int[][] arr = { { 2, 2, 7 }, { 4, 6, 8 }, { 7, 8, 9 } };
		int dsum = 0;
		int rdsum = 0;
        
        for (int i = 0; i<arr.length;i++) {
        	for(int j = 0;j<arr[i].length;j++) {
        	
        		
        		if(arr[i]==arr[j]) {
        			 dsum  = dsum+arr[i][j];
        			 
        			
        		}
        	}
        }
   	 
		 System.out.println(dsum);
		int j = 2;
		for (int i = 0; i < arr.length; i++) {
			for (;j < arr[i].length;) {

				rdsum  += arr[i][j];
				break;
			}
			j--;
		}
		System.out.println(rdsum);
	}

}

// if condition
//
//for(int i= 0;i<arr.length;i++) {
//	for(int j = 0;j<arr[i].length;j++) {
//	if(i+j==arr.length-1) {
//		rdsum = rdsum+arr[i][j];
//	}
//	}
//}
