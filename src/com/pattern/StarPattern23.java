package com.pattern;
//output
//1
//01
//101
//0101

public class StarPattern23 {

	public static void main(String[] args) {
		int i,j; 
		  for(i=1;i<=4;i++) 
		  { 
		   for(j=1;j<=4;j++) 
		   { 
		    if(i>=j) 
		    { 
		   
		 if(i%2==0&&j%2!=0||i%2!=0&&j%2==0) 
		    { 
		    System.out.print(0); 
		   } 
		    else  
		    { 
		   System.out.print(1); 
		  }}} 
		   System.out.println( ); 
	}
	}
}

