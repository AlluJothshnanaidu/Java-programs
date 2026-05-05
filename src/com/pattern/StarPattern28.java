package com.pattern;
//OUTPUT
//jABCj
//DOEOF
//GHSIJ
//KHLHM
//UNOPU

public class StarPattern28 {

	public static void main(String[] args) {
		char []arr = {'j','O','S','H','U'};
		char alpha = 'A';
            for(int i=0;i<arr.length;i++) {
            	for(int j=0;j<arr.length;j++) {
            		if(i==j || i+j == arr.length-1) {
            			System.out.print(arr[i]);
            			
            		}else {
            			System.out.print(alpha++);
            		}
            	} 
            	System.out.println();
            	
            }
	}

}
