package com.pattern;

public class StarPattern20 {

	public static void main(String[] args) {
        int i,j,K,star=9,space=0;
        for(i=1;i<=9;i++) {
        	for(j=1;j<=space;j++) {
        		System.out.print(" ");
        	}
        	for(K=1;K<=star;K++) {
        		System.out.print("*");
        	}
        	if(i<5) {
        		star=star-2;
        		space=space+1;
        	}else {
        		star=star+2;
        		space=space-1;
        	}
        	System.out.println( );
        }
	}

}
