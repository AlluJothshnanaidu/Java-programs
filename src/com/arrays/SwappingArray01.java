package com.arrays;
//with using third variable(temp)
//output:
//x value : 20
//y value : 10

public class SwappingArray01 {

	public static void main(String[] args) {
           int x = 10;
           int y = 20;
           int temp = 0;
           
           temp = x;
           x    = y;
           y    = temp;
           
           System.out.println("x value : " + x);
           System.out.println("y value : "+ y);
           
// without using third variable 
//           int a = 10;
//           int b = 20;
//           
//           a = a+b;
//           b = a-b;
//           a = a-b;
//           
//           System.out.println(" A value : "+ a);
//           System.out.println(" B value : "+ b);
           
	}

}
