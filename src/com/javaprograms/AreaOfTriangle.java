package com.javaprograms;

public class AreaOfTriangle {
     int A;
     int B ;
     
	public static void main(String[] args) {
		System.out.println("***AreaOfTriangle***");
		AreaOfTriangle a1 = new AreaOfTriangle();
		a1.A = 20;
		a1.B = 20;
				
		 float areaoftriangle  = ((a1.A*a1.B)*1/2);
		System.out.println("A: "+ a1.A);
		System.out.println("B: "+ a1.B);
		System.out.println("areaoftriangle is : "+ areaoftriangle);

	}

}
