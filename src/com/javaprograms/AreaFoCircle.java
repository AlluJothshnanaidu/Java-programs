package com.javaprograms;

import java.util.Scanner;

public class AreaFoCircle {
      int radius = 5;
      
      static double findAreaFoCircle(double radius) {
      	double AreaFoCircle = Math.PI * radius * radius;
      	return AreaFoCircle;
      }
      
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter the radius:");
	double radius = sc.nextDouble();
	double AreaFoCircle = findAreaFoCircle(radius);
	sc.close();
	
    System.out.println("AreaFoCircle : " + AreaFoCircle);
    
    }
}