package com.javaprograms;

import java.util.Scanner;

//if (score > 90) grade = 'A';
//else if (score > 80) grade = 'B';
public class TestIfConditions1 {

	public static void main(String[] args) {
     System.out.println("enter the MARKS");
     Scanner sc = new Scanner(System.in);
     int score= sc.nextInt();
     if(score > 90){
    	System.out.println("your grade is A");
     }
     else if(score > 80){
    	 System.out.println("your grade is B");
     }
    	 else if (score > 70) {
        System.out.println("your grade is c");
     }
    	 else {
    		 System.out.println("fail");
    	 }
     
    		 
	}

}
