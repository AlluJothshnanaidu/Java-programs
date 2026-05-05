package com.pattern;

public class StarPattern21 {

	public static void main(String[] args) {
           int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
           
          for(int i=1;1<arr.length;i++) {
        	  if(i%2==0) {
        	  for(int j=0;j<arr.length/2;j++) {
        		  int temp = arr[i][j];
        		  arr[i][j]=arr[i][arr.length-1-j];
        		  arr[i][arr.length-1-j]=temp;
        	  }
        	  }
        	  else {
        		 for(int j=1;j<arr.length;j++) {
        			 arr[i][j] = arr[i][j]*2;
        			 }
        		 }
        	  }
        		  
          } 
	}   


