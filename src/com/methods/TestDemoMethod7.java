package com.methods;

import java.util.Scanner;

//with argument + with return type
//write a program to find areas of triangle ,rectangle,square,circle
//area of triangle(0.5*b*h),rectangle(l*b),square(s*s),circle(pi*r*r).

public class TestDemoMethod7 {
	static double findareaoftriangle(double b,double h) {
		double artri = 0.5*b*h;
		return artri;
	}
	static double findareaofcircle(double r) {
		double arcir = Math.PI*r*r;
		return arcir;
	}
	static double findareaofsquare(double s) {
		double arsq = s*s;
		return arsq;
	}
	static double findareaofrectangle(double b1,double l) {
		double arrec = b1*l;
		return arrec;
	}

	public static void main(String[] args) {
       System.out.println("main method strated");
       Scanner sc = new Scanner(System.in);
//      Area of triangle
       System.out.println("enter the base");
       double base = sc.nextFloat();
       System.out.println("enter the height");
       float height = sc.nextFloat();
       double artri = findareaoftriangle(base,height);
       System.out.println("areaoftriangle is :"+artri);
//       area of circle
       System.out.println("enter the radius");
       double radius = sc.nextDouble();
       double arcir = findareaofcircle(radius);
       System.out.println("areaofcircle is: "+arcir);
//       area of square
       System.out.println("enter the radius");
       double side = sc.nextDouble();
       double arsq = findareaofsquare(side);
       System.out.println("areaofsquare is: "+arsq);
//       area of rectangle
       System.out.println("enter the base");
       double base1 = sc.nextDouble();
       System.out.println("enter the length");
       double length = sc.nextDouble();
       double arrec = findareaofrectangle(base1,length);
       System.out.println("areaofrectangle is: "+arrec);
	}

}
