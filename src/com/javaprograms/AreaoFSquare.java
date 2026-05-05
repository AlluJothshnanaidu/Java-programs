package com.javaprograms;

import java.util.Scanner;

public class AreaoFSquare {

		static double findAreaoFSquare(double side) {
	      	double AreaoFSquare = side * side;
	      	return AreaoFSquare;
	      }
	      
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		System.out.println("enter the side:");
		double side = sc.nextDouble();
		sc.close();
		
	    System.out.println("AreaoFSquare : " + side*side);
	    
		}

	}


